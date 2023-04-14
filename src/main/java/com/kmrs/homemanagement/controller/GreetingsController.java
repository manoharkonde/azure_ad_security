package com.kmrs.homemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greet")
    public String greetings(){
        return "Hello Welcome to Home Management";
    }
}
