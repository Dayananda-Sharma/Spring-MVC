package com.xworkz.prizemoney.repo;

import com.xworkz.prizemoney.entity.PrizeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class MoneyRepoImpl implements MoneyRepo {
    @Override
    public void saveDB(PrizeEntity prizeEntity) {

        System.out.println("repository===" + prizeEntity);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(prizeEntity);
            transaction.commit();

        } catch (Exception w) {
            w.printStackTrace();
        } finally {
            entityManagerFactory.close();
            entityManager.close();
        }
    }

    @Override
    public List<PrizeEntity> getData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("money");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("prize");
            List<PrizeEntity> resultList = (List<PrizeEntity>) query.getResultList();
            System.out.println("repository==="+resultList);
            return resultList;

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;

    }


}
