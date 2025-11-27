package com.example.demo.controller;

import com.example.demo.dao.AnnouncementsDAO;
import com.example.demo.entity.Announcements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/announcements")
public class AnnouncementsController {

    private AnnouncementsDAO announcementsDAO;
    public AnnouncementsController(AnnouncementsDAO announcementsDAO) {
        this.announcementsDAO = announcementsDAO;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Announcements> announcements = announcementsDAO.findAll();
        model.addAttribute("announcements", announcements);
        return "admin/announcements/announcements";
    }
}