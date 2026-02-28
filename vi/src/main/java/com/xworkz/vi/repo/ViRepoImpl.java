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
    public boolean insertData(ViEntity viEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(viEntity);
            transaction.commit();
           return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return  false;

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


    @Override
    public ViEntity getGmailValidation(String gmail) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("findByMail");
            query.setParameter("gmail",gmail);
            ViEntity singleResult =(ViEntity) query.getSingleResult();

            return singleResult;
        }catch (Exception n){
            n.printStackTrace();
            return null;

        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public ViEntity getNumberValidation(String number) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("findByNumber");
            query.setParameter("number",number);
            ViEntity singleResult =(ViEntity) query.getSingleResult();
            return singleResult;

        }catch (Exception s){
            s.printStackTrace();
            return null;
        }
        finally {
            entityManager.close();
        }

    }

    @Override
    public ViEntity GetIdValidation(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            ViEntity viEntity = entityManager.find(ViEntity.class, id);

            return viEntity;
        }catch (Exception nm){
            System.out.println("update exception"+nm.getMessage());
            return null;
        }
        finally {
            entityManager.close();
        }

    }
}
