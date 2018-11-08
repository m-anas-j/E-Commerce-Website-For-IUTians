package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {


    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;


    public ArrayList<ProductTableEntity> getAllProducts() {
        return null;
    }

    public void addProduct(ProductTableEntity newProduct) {


        Configuration configuration = new Configuration().configure().addAnnotatedClass(ProductTableEntity.class);
        sessionFactory = configuration.buildSessionFactory();


        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(newProduct);
        transaction.commit();

        System.out.println("Successfully added product");

    }

    public void updateProduct(ProductTableEntity existingProduct) {

    }

    public void deleteProduct(ProductTableEntity existingProduct) {

    }
}
