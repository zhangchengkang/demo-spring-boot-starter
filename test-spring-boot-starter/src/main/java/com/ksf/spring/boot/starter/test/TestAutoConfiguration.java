package com.ksf.spring.boot.starter.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({UserProperties.class})
@ConditionalOnBean({UserProperties.class})
public class TestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TestClient makeTestClient(UserProperties userProperties) {
        return TestClient.builder().ip(userProperties.getIp()).port(userProperties.getPort()).build();
    }
}
