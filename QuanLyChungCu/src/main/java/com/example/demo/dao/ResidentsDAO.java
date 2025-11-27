package com.example.demo.dao;

import com.example.demo.entity.Maintenance;
import com.example.demo.entity.Residents;

import java.util.List;

public interface ResidentsDAO {
    List<Residents> findAll();
    Residents findById(int id);
    Residents save(Residents residents);
    void deleteById(int id);
}
