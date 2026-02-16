package com.xworkz.phonepay.repository;

import com.xworkz.phonepay.entity.PhonepayEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;

@Repository
public class PhonepayRepositoryImpl implements PhonepayRepository{

    @Override
    public void saveDb(PhonepayEntity phonepayEntity) {
        System.out.println("repository==="+phonepayEntity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pay");
        EntityManager entityManager=null;

try {


     entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();

    entityManager.persist(phonepayEntity);
    transaction.commit();


}catch (Exception w){
    w.printStackTrace();
}finally {
    entityManagerFactory.close();
    entityManager.close();
}
    }
}
