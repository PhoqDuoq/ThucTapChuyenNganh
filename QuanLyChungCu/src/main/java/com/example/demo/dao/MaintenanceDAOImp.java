package com.example.demo.dao;

import com.example.demo.entity.Maintenance;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MaintenanceDAOImp implements MaintenanceDAO {

    private EntityManager em;

    public MaintenanceDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Maintenance> findAll() {
        TypedQuery<Maintenance> query = em.createQuery("FROM Maintenance", Maintenance.class);
        return query.getResultList();
    }

    @Override
    public Maintenance findById(int id) {
        return em.find(Maintenance.class, id);
    }

    @Override
    public Maintenance save(Maintenance maintenance) {
        return em.merge(maintenance);
    }

    @Override
    public void deleteById(Maintenance maintenance) {

    }

    @Override
    public void deleteById(int id) {
        Maintenance maintenance = em.find(Maintenance.class, id);
        if (maintenance != null) {
            em.remove(maintenance);
        }
    }
}