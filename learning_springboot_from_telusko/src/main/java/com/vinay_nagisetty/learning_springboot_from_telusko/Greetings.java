package com.vinay_nagisetty.learning_springboot_from_telusko;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
    @RequestMapping("/")
    public String greet() {
        return "Hello, Welcome to Spring Boot!";
    }
}
