package com.example.demo.dao;

import com.example.demo.entity.Apartments;

import java.util.List;

public interface ApartmentsDAO {
    List<Apartments> findAll();
    Apartments findById(int id);
    Apartments save(Apartments apartments);
    void deleteById(int id);
}
