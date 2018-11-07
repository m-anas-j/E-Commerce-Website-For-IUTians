package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {

    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;


    public ArrayList<ProductTableEntity> getAllProducts() {
        return null;
    }

    public void addProduct(ProductTableEntity newProduct) {

        newProduct.setId(123);
        //session.save(newProduct);
        //Configuration con = new Configuration().configure().addAnnotatedClass(ProductTableEntity.class);
        try {
            standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
            Metadata metadata = metadataSources.getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        //SessionFactory sf = con.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(newProduct);
        tx.commit();

    }

    public void updateProduct(ProductTableEntity existingProduct) {

    }

    public void deleteProduct(ProductTableEntity existingProduct) {

    }
}
