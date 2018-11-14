package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {


    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;


    public List<ProductTableEntity> getAllProducts()
    {
        List<ProductTableEntity> productList = new ArrayList<ProductTableEntity>();
        ProductTableEntity singleProduct = null;

        Configuration configuration = new Configuration().configure().addAnnotatedClass(ProductTableEntity.class);
        sessionFactory = configuration.buildSessionFactory();


        Session currentSession = sessionFactory.openSession();
        /*long i = 1;

        while (true)
        {
            Transaction transaction = currentSession.beginTransaction();
            singleProduct = (ProductTableEntity) currentSession.get(ProductTableEntity.class,i);

            if(singleProduct==null)
                break;

            productList.add(singleProduct);
            transaction.commit();
            singleProduct=null;

        }*/
        productList = currentSession.createSQLQuery("   SELECT * FROM PRODUCT_TABLE").addEntity(ProductTableEntity.class).list();


        return productList;
    }

    public ProductTableEntity getSingleProduct(long productId) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(ProductTableEntity.class);
        sessionFactory = configuration.buildSessionFactory();


        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        ProductTableEntity productTableEntity = currentSession.get(ProductTableEntity.class,productId);
        transaction.commit();

        return productTableEntity;
    }

    //@Transactional
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
