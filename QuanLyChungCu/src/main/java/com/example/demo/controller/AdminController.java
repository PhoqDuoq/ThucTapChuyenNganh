package com.example.demo.controller;

import com.example.demo.dao.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


    private final ApartmentsDAO apartmentsDAO;
    private final ResidentsDAO residentsDAO;
    private final MaintenanceDAO maintenanceDAO;
    private final FeesDAO feesDAO;


    public AdminController(ApartmentsDAO apartmentsDAO,
                           ResidentsDAO residentsDAO,
                           MaintenanceDAO maintenanceDAO,
                           FeesDAO feesDAO) {
        this.apartmentsDAO = apartmentsDAO;
        this.residentsDAO = residentsDAO;
        this.maintenanceDAO = maintenanceDAO;
        this.feesDAO = feesDAO;
    }

    @GetMapping("/")
    public String dashboard(Model model) {

        int totalApartments = apartmentsDAO.findAll().size();

        int totalResidents = residentsDAO.findAll().size();

        int totalMaintenance = maintenanceDAO.findAll().size();

        long unpaidInvoices = feesDAO.findAll().stream()
                .filter(f -> !"Đã thanh toán".equals(f.getTrangThai()))
                .count();

        // gửi sang file HTML
        model.addAttribute("totalApartments", totalApartments);
        model.addAttribute("totalResidents", totalResidents);
        model.addAttribute("totalMaintenance", totalMaintenance);
        model.addAttribute("unpaidInvoices", unpaidInvoices);

        return "/admin";
    }
}