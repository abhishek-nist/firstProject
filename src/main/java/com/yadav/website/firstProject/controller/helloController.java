package com.yadav.website.firstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String helloContoller(){
        return "Hello Amigos!";
    }
}
