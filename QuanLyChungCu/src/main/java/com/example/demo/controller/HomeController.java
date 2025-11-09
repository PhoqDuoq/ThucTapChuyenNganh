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
        return "about";
    }

    @GetMapping("/booking")
    public String booking(){
        return "booking";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/team")
    public String ourTeam(){
        return "our_team";
    }

    @GetMapping("/rooms")
    public String rooms(){
        return "rooms";
    }

    @GetMapping("/service")
    public String service(){
        return "service";
    }

    @GetMapping("/testimonial")
    public String testimonial(){
        return "testimonial";
    }

}
