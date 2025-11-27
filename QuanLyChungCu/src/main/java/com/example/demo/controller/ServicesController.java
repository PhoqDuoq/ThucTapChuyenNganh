package com.example.demo.controller;

import com.example.demo.dao.ServicesDAO;
import com.example.demo.entity.Services;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/services")
public class ServicesController {

    private ServicesDAO servicesDAO;

    public ServicesController(ServicesDAO servicesDAO) {
        this.servicesDAO = servicesDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Services> services = servicesDAO.findAll();
        model.addAttribute("services", services);
        return "admin/services/services";
    }
}