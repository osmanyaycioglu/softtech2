package com.training.softtech;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CutomerRepository {

    @Autowired
    private DataSource           ds;

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    public void insertPureJava(final Customer customer) {
        EntityManager createEntityManagerLoc = this.entityManagerFactory.createEntityManager();
        try {
            createEntityManagerLoc.getTransaction()
                                  .begin();
            createEntityManagerLoc.persist(customer);
            createEntityManagerLoc.getTransaction()
                                  .commit();
        } catch (Exception eLoc) {
            createEntityManagerLoc.getTransaction()
                                  .rollback();
        } finally {
            createEntityManagerLoc.close();
        }
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertSpring(final Customer customer) {
        EntityManager createEntityManagerLoc = this.entityManagerFactory.createEntityManager();
        try {
            createEntityManagerLoc.joinTransaction();
            createEntityManagerLoc.persist(customer);
        } finally {
            createEntityManagerLoc.close();
        }
    }


}
