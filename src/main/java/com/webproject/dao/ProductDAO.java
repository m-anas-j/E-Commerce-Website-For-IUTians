package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;


public interface ProductDAO {



  /*  Configuration con = new Configuration().configure("persistence.xml");
    SessionFactory sf = con.buildSessionFactory();
    Session session = sf.openSession();*/

    public ArrayList<ProductTableEntity> getAllProducts();
    public void addProduct(ProductTableEntity newProduct);
    public void updateProduct(ProductTableEntity existingProduct);
    public  void deleteProduct(ProductTableEntity existingProduct);
}
