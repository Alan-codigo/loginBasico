package com.login.login.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class demoController {

    @GetMapping("/demo")
    public String showHome() {
        return "hello word;";
    }
    

}
