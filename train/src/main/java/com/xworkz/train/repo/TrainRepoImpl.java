package com.xworkz.train.repo;

import com.xworkz.train.entity.TrainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository

public class TrainRepoImpl implements TrainRepo{
@Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean saveDB(TrainEntity  trainEntity) {
        System.out.println("repo"+trainEntity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(trainEntity);
            transaction.commit();

            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            entityManager.close();
        }

    }

    @Override
    public List<TrainEntity> getData() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("name");
            List<TrainEntity> resultList =(List<TrainEntity>) query.getResultList();

            return resultList;
        }catch (Exception e){
            e.printStackTrace();

            return Collections.emptyList();
        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public TrainEntity gmailValidation(String gmail) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("gmail");
            query.setParameter("gmail",gmail);

            TrainEntity singleResult = (TrainEntity) query.getSingleResult();

            return singleResult;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public TrainEntity idValidation(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            TrainEntity trainEntity = entityManager.find(TrainEntity.class, id);

            return trainEntity;

        }catch (Exception  e){
            System.out.println("UpdateId"+e.getMessage());
            return null;
        }
        finally {
            entityManager.close();
        }
    }

}
