package com.ming.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/food.gif")
    public String static1(){
        return "aaa";
    }
}
