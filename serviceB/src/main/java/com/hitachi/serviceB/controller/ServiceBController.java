package com.hitachi.serviceB.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class ServiceBController {

    @Value("${server.port}")
    int port;

    @GetMapping("/data")
    public MockData getMockData() {
        return new MockData("Sample Data from port:", port);
    }
}

class MockData {
    private String name;
    private int id;

    // Constructor
    public MockData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
