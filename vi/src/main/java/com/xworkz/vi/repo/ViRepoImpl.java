package com.xworkz.vi.repo;

import com.xworkz.vi.dto.ViDto;
import com.xworkz.vi.entity.ViEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class ViRepoImpl implements ViRepo{
@Autowired
EntityManagerFactory entityManagerFactory;
    @Override
    public void insertData(ViEntity viEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(viEntity);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();

        }
    }

    @Override
    public List<ViEntity> AllData() {

//EntityManagerFactory entityManagerFactory1 = Persistence.createEntityManagerFactory("");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("name");
            List<ViEntity> resultList= (List<ViEntity>) query.getResultList();
            return resultList;


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }

        return Collections.emptyList();
    }
}
