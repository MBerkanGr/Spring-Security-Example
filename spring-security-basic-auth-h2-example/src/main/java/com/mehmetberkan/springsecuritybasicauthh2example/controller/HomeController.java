package com.mehmetberkan.springsecuritybasicauthh2example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome screen";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard screen";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin screen";
    }


}
