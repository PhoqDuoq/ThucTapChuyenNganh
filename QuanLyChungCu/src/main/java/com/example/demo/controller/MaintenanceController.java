package com.example.demo.controller;

import com.example.demo.dao.MaintenanceDAO;
import com.example.demo.entity.Maintenance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/maintenance")
public class MaintenanceController {

    private MaintenanceDAO maintenanceDAO;

    public MaintenanceController(MaintenanceDAO maintenanceDAO) {
        this.maintenanceDAO = maintenanceDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Maintenance> maintenanceList = maintenanceDAO.findAll();
        model.addAttribute("maintenanceList", maintenanceList);
        return "admin/maintenance/maintenance";
    }
}