package com.xworkz.airtel.repo;

import com.xworkz.airtel.dto.AirtelDto;
import com.xworkz.airtel.entity.AirtelEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class AirtelRepoImpl implements AirtelRepo{
    @Override
    public void insertData(AirtelEntity airtelEntity) {
        System.out.println("repo"+airtelEntity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(airtelEntity);
            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public List<AirtelEntity> getData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("name");
            List <AirtelEntity>  resultList=(List<AirtelEntity>) query.getResultList();
            return resultList;

        }catch (Exception exception){
            exception.printStackTrace();
        }
finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        return Collections.emptyList();
    }
}