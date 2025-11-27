package com.example.demo.dao;

import com.example.demo.entity.Fees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FeesDAOImp implements FeesDAO {

    private EntityManager em;

    public FeesDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Fees> findAll() {
        TypedQuery<Fees> query = em.createQuery("FROM Fees", Fees.class);
        return query.getResultList();
    }

    @Override
    public Fees findById(int id) {
        return em.find(Fees.class, id);
    }

    @Override
    public Fees save(Fees fees) {
        return em.merge(fees);
    }

    @Override
    public void deleteById(int id) {
        Fees fees = em.find(Fees.class, id);
        if (fees != null) {
            em.remove(fees);
        }
    }
}