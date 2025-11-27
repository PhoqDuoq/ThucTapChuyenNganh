package com.example.demo.dao;

import com.example.demo.entity.Announcements;

import java.util.List;

public interface AnnouncementsDAO {
    List<Announcements> findAll();
    Announcements findById(int id);
    Announcements save(Announcements announcements);
    void deleteById(int id);
}
