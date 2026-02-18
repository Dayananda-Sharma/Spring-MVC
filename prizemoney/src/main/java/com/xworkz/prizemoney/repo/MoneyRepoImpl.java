package com.xworkz.prizemoney.repo;

import com.xworkz.prizemoney.entity.PrizeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

}
