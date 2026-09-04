package com.springbootlearning.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static class User {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String toString() {
            return "User{name='" + name + "', age=" + age + "}";
        }
    }

    // 简单的Hello World接口
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // 简单参数写法
    @GetMapping("/simpleParam")
    public String simpleParam(String name, Integer age) {
        System.out.println("Name: " + name + ", Age: " + age);
        return "Name: " + name + ", Age: " + age;
    }

    // 实体参数写法
    @GetMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        return "User: " + user;
    }
}
