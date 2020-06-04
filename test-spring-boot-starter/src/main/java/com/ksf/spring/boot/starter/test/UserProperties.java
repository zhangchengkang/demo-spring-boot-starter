package com.ksf.spring.boot.starter.test;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConditionalOnProperty(prefix = "test.client", name = "enable", havingValue = "true")//当配置文件中test.client.enabled=true时,才会注入
@ConfigurationProperties(prefix = "test.client")//批量注入配置文件,前提是前缀匹配
public class UserProperties {

    private String ip;
    private Integer port;
}
