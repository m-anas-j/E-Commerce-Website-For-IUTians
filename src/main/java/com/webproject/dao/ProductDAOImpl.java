package com.webproject.dao;

import com.webproject.entity.ProductTable;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {

    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;


    public ArrayList<ProductTable> getAllProducts() {
        return null;
    }

    public void addProduct(ProductTable newProduct) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(newProduct);

        entityManager.getTransaction().commit();

        entityManagerFactory.close();

        System.out.println("Successfully added product");

    }

    public void updateProduct(ProductTable existingProduct) {

    }

    public void deleteProduct(ProductTable existingProduct) {

    }
}
