package com.example.mytwitter_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public String home(){
        return "Hello Spring";
    }

    @GetMapping("/getUsers")
    public String home2(){
        return "{\"name\":\"Bhupinder\"}";
    }
}
