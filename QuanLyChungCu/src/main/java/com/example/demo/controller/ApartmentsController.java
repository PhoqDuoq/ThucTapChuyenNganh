package com.example.demo.controller;

import com.example.demo.dao.ApartmentsDAO;
import com.example.demo.entity.Apartments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/apartments")
public class ApartmentsController {

    private ApartmentsDAO apartmentsDAO;

    public ApartmentsController(ApartmentsDAO apartmentsDAO) {
        this.apartmentsDAO = apartmentsDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Apartments> apartments = apartmentsDAO.findAll();
        model.addAttribute("apartments", apartments);
        return "admin/apartments/apartments";
    }
}