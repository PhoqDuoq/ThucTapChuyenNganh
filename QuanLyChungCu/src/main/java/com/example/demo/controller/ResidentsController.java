package com.example.demo.controller;

import com.example.demo.dao.ResidentsDAO;
import com.example.demo.entity.Residents;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/residents")
public class ResidentsController {

    private ResidentsDAO residentsDAO;

    public ResidentsController(ResidentsDAO residentsDAO) {
        this.residentsDAO = residentsDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Residents> residents = residentsDAO.findAll();
        model.addAttribute("residents", residents);
        return "admin/residents/residents";
    }
}