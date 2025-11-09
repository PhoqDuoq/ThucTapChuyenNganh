package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "home/about";
    }

    @GetMapping("/booking")
    public String booking(){
        return "home/booking";
    }

    @GetMapping("/contact")
    public String contact(){
        return "home/contact";
    }

    @GetMapping("/team")
    public String ourTeam(){
        return "home/our_team";
    }

    @GetMapping("/rooms")
    public String rooms(){
        return "home/rooms";
    }

    @GetMapping("/service")
    public String service(){
        return "home/service";
    }

    @GetMapping("/testimonial")
    public String testimonial(){
        return "home/testimonial";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

}
