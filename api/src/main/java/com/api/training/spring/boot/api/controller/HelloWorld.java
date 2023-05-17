package com.api.training.spring.boot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping
    public String helloWorld() {
        System.out.println("Você Conseguiu!");
        return "Você Conseguiu!";
    }
}
