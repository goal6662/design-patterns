package com.goal.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "login")  // 将多个值绑定到一个对象
public class LoginTypeConfig {

    private Map<String, String> types;

}
