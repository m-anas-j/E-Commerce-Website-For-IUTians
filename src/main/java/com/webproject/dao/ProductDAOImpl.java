package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {


    public ArrayList<ProductTableEntity> getAllProducts() {
        return null;
    }

    public void addProduct(ProductTableEntity newProduct) {

        newProduct.setId(123);
        //session.save(newProduct);
        Configuration con = new Configuration().configure().addAnnotatedClass(ProductTableEntity.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(newProduct);
        tx.commit();

    }

    public void updateProduct(ProductTableEntity existingProduct) {

    }

    public void deleteProduct(ProductTableEntity existingProduct) {

    }
}
