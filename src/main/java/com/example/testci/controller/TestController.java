package com.example.testci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
