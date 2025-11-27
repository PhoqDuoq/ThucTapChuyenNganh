package com.example.demo.controller;

import com.example.demo.dao.FeesDAO;
import com.example.demo.entity.Fees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/fees")
public class FeesController {

    private FeesDAO feesDAO;

    public FeesController(FeesDAO feesDAO) {
        this.feesDAO = feesDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Fees> fees = feesDAO.findAll();
        model.addAttribute("fees", fees);
        return "admin/fees/fees";
    }
}