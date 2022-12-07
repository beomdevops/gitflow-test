package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHello(){
        return "hello";
    }
    @GetMapping("/v1")
    public String getHellov1(){
        return "hellov2";
    }
}
