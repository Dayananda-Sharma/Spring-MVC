package com.xworkz.ssp.repo;

import com.xworkz.ssp.entity.SspEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class SspRepoImpl implements SspRepo{

    @Override
    public void insertData(SspEntity sspEntity) {
        System.out.println("repo"+sspEntity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(sspEntity);
            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManagerFactory.close();
            entityManager.close();
        }
    }
}
