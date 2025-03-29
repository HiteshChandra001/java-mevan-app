package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Control {

    @GetMapping
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String getHello2() {
        return "Hello World2!";
    }

    @GetMapping("/aman")
    public String getaman() {
        return "Hello aman!";
    }
}
