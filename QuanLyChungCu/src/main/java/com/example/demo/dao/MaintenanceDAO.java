package com.example.demo.dao;

import com.example.demo.entity.Announcements;
import com.example.demo.entity.Maintenance;

import java.util.List;

public interface MaintenanceDAO {
    List<Maintenance> findAll();
    Maintenance findById(int id);
    Maintenance save(Maintenance maintenance);
    void deleteById(Maintenance maintenance);

    void deleteById(int id);
}
