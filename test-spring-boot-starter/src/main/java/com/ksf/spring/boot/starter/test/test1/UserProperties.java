package com.ksf.spring.boot.starter.test.test1;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConditionalOnProperty(prefix = "test.one", name = "enable", havingValue = "true")
@ConfigurationProperties(prefix = "test.one")
public class UserProperties {

    private String ip;
    private Integer port;
}
