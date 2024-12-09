package com.hitachi.serviceA.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        // You could check the health of a database or other services here
        boolean isHealthy = checkServiceHealth();
        if (isHealthy) {
            return ResponseEntity.ok("Service is healthy");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Service is unhealthy");
        }
    }

    private boolean checkServiceHealth() {
        // Example check logic (e.g., check database connection)
        return true;
    }
}
