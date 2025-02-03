package com.study.myfirst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 91202
 */
@RestController
@RequestMapping("/say")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, my first java project";
    }

}
