package com.yjl.boot.controller;

import com.yjl.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-22 14:56
 **/
//@Controller
//@ResponseBody
@RestController
@Slf4j
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/hello")
    public String hello01(@RequestParam("name") String name) {
        log.info("收到参数：{},{}", name, name);
        return "Hello,Spring Boot2,你好:" + name;
    }

    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }
}
