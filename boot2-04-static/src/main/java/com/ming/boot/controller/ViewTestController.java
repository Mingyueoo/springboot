package com.ming.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {
    @GetMapping("/ming")
    public String ming(Model model){
        model.addAttribute("msg", "hello,Ming");
        model.addAttribute("link","http://www.baidu.com");
        return "success";

    }
}
