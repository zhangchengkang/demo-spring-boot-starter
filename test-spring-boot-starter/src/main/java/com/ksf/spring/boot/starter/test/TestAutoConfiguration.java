package com.ksf.spring.boot.starter.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({UserProperties.class})//开启@ConfigurationProperties。
@ConditionalOnBean({UserProperties.class})//当给定的bean存在时,实例化下面@Bean指定的Bean
public class TestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean//当Spring Context中不存在该Bean时才会注册
    public TestClient makeTestClient(UserProperties userProperties) {
        return TestClient.builder().ip(userProperties.getIp()).port(userProperties.getPort()).build();
    }
}
