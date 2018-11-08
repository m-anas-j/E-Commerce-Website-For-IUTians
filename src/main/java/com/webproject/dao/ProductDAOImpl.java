package com.webproject.dao;

import com.webproject.entity.ProductTable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {


    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;


    public ArrayList<ProductTable> getAllProducts() {
        return null;
    }

    public void addProduct(ProductTable newProduct) {


        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //entityManager.getTransaction().begin();

        entityManager.persist(newProduct);
        entityManager.

        //entityManager.getTransaction().commit();

        entityManagerFactory.close();*/

        Configuration configuration = new Configuration().configure().addAnnotatedClass(ProductTable.class);
        sessionFactory = configuration.buildSessionFactory();


        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(newProduct);
        transaction.commit();

        System.out.println("Successfully added product");

    }

    public void updateProduct(ProductTable existingProduct) {

    }

    public void deleteProduct(ProductTable existingProduct) {

    }
}
