package com.study.myfirst.controller;

import com.study.myfirst.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 91202
 */
@RestController
@RequestMapping("/say")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        //helloService.setCar();
        helloService.setUser();
        return "success";
    }

}
