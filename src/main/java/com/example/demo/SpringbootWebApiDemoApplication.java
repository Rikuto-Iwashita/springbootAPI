package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.configuration.DataSourceConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DataSourceConfigurationProperties.class)
public class SpringbootWebApiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApiDemoApplication.class, args);
    }
}