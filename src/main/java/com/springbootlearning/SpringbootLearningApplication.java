package com.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ComponentScan(basePackages = {"com.springbootlearning.controller", "com.springbootlearning.service", "com.springbootlearning.dao"})
// 声明默认扫描的包
@SpringBootApplication
public class SpringbootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearningApplication.class, args);
    }

}
