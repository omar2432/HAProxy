package com.hitachi.serviceA.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
        @Value("${server.port}")
        int port;

        @GetMapping
        public String getGreeting() {
            return "Hello from Service A! at port:"+port;
        }

}
