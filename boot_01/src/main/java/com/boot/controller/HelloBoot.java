package com.boot.controller;

import com.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanyu
 * @createTime 2022-03-19 22:54
 */
@RestController
@Slf4j
public class HelloBoot {

    @Autowired
    Car car;

    @RequestMapping("/hello")
    public String handle01(){
        log.info("hello请求");
        return "Hello, Spring Boot 2!";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
