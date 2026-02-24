package com.xworkz.nsp.repo;

import com.xworkz.nsp.dto.NspDto;
import com.xworkz.nsp.entity.NspEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class NspRepoImpl implements NspRepo {

    @Override
    public void insertData(NspEntity nspEntity) {
        System.out.println("repo=="+nspEntity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(nspEntity);
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
    public List<NspEntity> repoData() {
      //  System.out.println("");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            Query query = entityManager.createNamedQuery("nsp");
            List<NspEntity> entities =(List<NspEntity>) query.getResultList();

            return entities;
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