package com.example.demo.dao;

import com.example.demo.entity.Announcements;
import jakarta.persistence.EntityManager;


import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AnnouncementsDAOImp implements AnnouncementsDAO {
    private EntityManager em;
    public AnnouncementsDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Announcements> findAll() {
        TypedQuery<Announcements> query = em.createQuery(" from Announcements", Announcements.class);
        return query.getResultList();
    }

    @Override
    public Announcements findById(int id) {
        return em.find(Announcements.class, id);
    }

    @Override
    public Announcements save(Announcements announcements) {
        return em.merge(announcements);
    }

    @Override
    public void deleteById(int id) {
        Announcements announcements = em.find(Announcements.class, id);
        if (announcements != null) {
            em.remove(announcements);
        }
    }
}
