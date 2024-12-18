package com.ming.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.ming.admin")
@SpringBootApplication
public class Boot205WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot205WebApplication.class, args);
    }

}
