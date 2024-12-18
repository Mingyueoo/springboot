package com.ming.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FormTestController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
    @RequestMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("avatar") MultipartFile avatar,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        if(avatar!=null){
            String originalFilename = avatar.getOriginalFilename();
            avatar.transferTo(new File("C:\\Users\\Mingy\\developer\\uploadDownload"+originalFilename));
        }
        if(photos.length>0){
            for (MultipartFile photo : photos) {
                if(!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("C:\\Users\\Mingy\\developer\\uploadDownload"+originalFilename));
                }
            }
        }
















        return "main";
    }
}
