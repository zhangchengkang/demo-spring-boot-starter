package com.ksf.spring.boot.starter.test.test1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestClient {
    private String ip;
    private Integer port;

    public String getAddress() {
        return ip + ":" + port;
    }
}
