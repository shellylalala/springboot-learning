package com.springbootlearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    private static class Address {
        private String province;
        private String city;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }
    }

    private static class User {
        private String name;
        private Integer age;
        private Address address;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public String toString() {
            return "User{name='" + name + "', age=" + age + ", address=" + address + "}";
        }
    }

    // 响应字符串
    @RequestMapping("/helloResponse")
    public Result hello() {
        System.out.println("Hello, World!");
        //return "Hello, World!";
        return Result.success("Hello, World!");
    }

    // 响应实体对象
    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("Guangdong");
        addr.setCity("Shenzhen");
        return Result.success(addr);
    }

    // 响应集合数据
    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        //return list;
        return Result.success(list);
    }
}
