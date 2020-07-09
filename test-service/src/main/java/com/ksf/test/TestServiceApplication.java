package com.ksf.test;

import com.ksf.spring.boot.starter.test.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(value = "com.*")
@RestController
public class TestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
    }

    @Autowired
    private TestClient testClient;

    @GetMapping("/init")
    public String init() {
        return testClient.getAddress();
    }

}
