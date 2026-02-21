package com.xworkz.ssp.repo;

import com.xworkz.ssp.entity.SspEntity;
import com.xworkz.ssp.repo.SspRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class SspRepoImpl implements SspRepo {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void insertData(SspEntity sspEntity) {

        System.out.println("Repo : " + sspEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(sspEntity);

            transaction.commit();
            System.out.println("Data inserted successfully ✅");

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}