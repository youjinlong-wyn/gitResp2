package com.yjl.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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
public class HelloController {
    @RequestMapping("/hello")
    public String hello01() {
        return "Hello,Spring Boot2,ÄãºÃ£¡";
    }

}
