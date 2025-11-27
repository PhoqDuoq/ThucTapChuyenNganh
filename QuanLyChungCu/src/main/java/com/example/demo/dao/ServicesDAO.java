package com.example.demo.dao;

import com.example.demo.entity.Announcements;
import com.example.demo.entity.Services;

import java.util.List;

public interface ServicesDAO {
    List<Services> findAll();
    Services findById(int id);
    Services save(Services services);
    void deleteById(int id);
}
