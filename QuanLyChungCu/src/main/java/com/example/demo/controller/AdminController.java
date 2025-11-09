package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin/")
    public String admin(){
        return "admin";
    }

    @GetMapping("/admin/announcements")
    public String announcements(){
        return "admin/announcements/announcements";
    }

    @GetMapping("/admin/apartments")
    public String apartments(){
        return "admin/apartments/apartments";
    }

    @GetMapping("/admin/fees")
    public String fees(){
        return "admin/fees/fees";
    }

    @GetMapping("/admin/maintenance")
    public String maintenance(){
        return "admin/maintenance/maintenance";
    }

    @GetMapping("/admin/residents")
    public String residents(){
        return "admin/residents/residents";
    }

    @GetMapping("/admin/services")
    public String services(){
        return "admin/services/services";
    }
}
