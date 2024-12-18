package com.ming.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {
    @GetMapping("/basic_table")//访问的链接是没有.html的
    public String basic_table(){
        int i =10/0;//测试报500错误
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(){
        return "table/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

}
