package com.hitachi.serviceA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class GreetingController {

    @Value("${server.port}")
    int port;

    @GetMapping("/greet")
    public String getGreeting() {
        return "Hello from Service A! at port:"+port;
    }
}