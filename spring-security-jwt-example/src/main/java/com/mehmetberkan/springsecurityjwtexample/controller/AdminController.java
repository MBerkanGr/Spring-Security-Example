package com.mehmetberkan.springsecurityjwtexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin")
public class AdminController {
    @GetMapping
    public ResponseEntity<String> getAdminDashboard() {
        return ResponseEntity.ok("Admin Dashboard");
    }
}
