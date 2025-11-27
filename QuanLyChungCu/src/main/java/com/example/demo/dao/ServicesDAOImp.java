package com.example.demo.dao;

import com.example.demo.entity.Services;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ServicesDAOImp implements ServicesDAO {

    private EntityManager em;

    public ServicesDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Services> findAll() {
        TypedQuery<Services> query = em.createQuery("FROM Services", Services.class);
        return query.getResultList();
    }

    @Override
    public Services findById(int id) {
        return em.find(Services.class, id);
    }

    @Override
    public Services save(Services services) {
        return em.merge(services);
    }

    @Override
    public void deleteById(int id) {
        Services services = em.find(Services.class, id);
        if (services != null) {
            em.remove(services);
        }
    }
}