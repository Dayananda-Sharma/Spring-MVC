package com.xworkz.yuvanidhi.repo;

import com.xworkz.yuvanidhi.entity.YuvaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class YuvaRepoImpl implements YuvaRepo{
    @Override
    public void insertData(YuvaEntity yuvaEntity) {
        System.out.println("repo"+yuvaEntity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(yuvaEntity);
            transaction.commit();

        }catch (Exception exception){
            exception.printStackTrace();

        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }

    @Override
    public List<YuvaEntity> allData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("yuva");
            List <YuvaEntity> resultList =( List <YuvaEntity>) query.getResultList();
            return resultList;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        return null;
    }

}
