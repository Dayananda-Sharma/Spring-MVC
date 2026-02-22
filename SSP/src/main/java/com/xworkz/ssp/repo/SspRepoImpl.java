package com.xworkz.ssp.repo;

import com.xworkz.ssp.entity.SspEntity;
import com.xworkz.ssp.repo.SspRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class SspRepoImpl implements SspRepo {



    @Override
    public void insertData(SspEntity sspEntity) {
        System.out.println("Repo : " + sspEntity);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ssp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        try {
            EntityTransaction transaction = entityManager.getTransaction();

            transaction.begin();

            entityManager.persist(sspEntity);
            transaction.commit();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public List<SspEntity> getData() {
        System.out.println("ServiceEntity");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ssp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("ssp");
            List<SspEntity> resultList = (List<SspEntity>)query.getResultList();
            System.out.println("repo:"+resultList);
            return resultList;

        }catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }
}