package com.example.demo.dao;

import com.example.demo.entity.Residents;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ResidentsDAOImp implements ResidentsDAO {

    private EntityManager em;

    public ResidentsDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Residents> findAll() {
        TypedQuery<Residents> query = em.createQuery("FROM Residents", Residents.class);
        return query.getResultList();
    }

    @Override
    public Residents findById(int id) {
        return em.find(Residents.class, id);
    }

    @Override
    public Residents save(Residents residents) {
        return em.merge(residents);
    }

    @Override
    public void deleteById(int id) {
        Residents residents = em.find(Residents.class, id);
        if (residents != null) {
            em.remove(residents);
        }
    }
}