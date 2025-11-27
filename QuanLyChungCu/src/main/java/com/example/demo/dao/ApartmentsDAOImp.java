package com.example.demo.dao;

import com.example.demo.entity.Apartments;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ApartmentsDAOImp implements ApartmentsDAO {

    private EntityManager em;

    public ApartmentsDAOImp(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Apartments> findAll() {
        TypedQuery<Apartments> query = em.createQuery(" from Apartments ", Apartments.class);
        return query.getResultList();
    }

    @Override
    public Apartments findById(int id) {
        return em.find(Apartments.class, id);
    }

    @Override
    public Apartments save(Apartments apartments) {
        return em.merge(apartments);
    }

    @Override
    public void deleteById(int id) {
        Apartments apartments = em.find(Apartments.class, id);
        if (apartments != null) {
            em.remove(apartments);
        }
    }
}
