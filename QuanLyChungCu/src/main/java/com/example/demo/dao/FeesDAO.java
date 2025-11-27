package com.example.demo.dao;

import com.example.demo.entity.Announcements;
import com.example.demo.entity.Fees;

import java.util.List;

public interface FeesDAO {
    List<Fees> findAll();
    Fees findById(int id);
    Fees save(Fees fees);
    void deleteById(int id);
}
