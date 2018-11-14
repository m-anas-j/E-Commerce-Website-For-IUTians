package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;
import com.webproject.entity.ProductTableEntity;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public interface ProductDAO {



  /*  Configuration con = new Configuration().configure("persistence.xml");
    SessionFactory sf = con.buildSessionFactory();
    Session session = sf.openSession();*/

    public List<ProductTableEntity> getAllProducts();
    public ProductTableEntity getSingleProduct(long productId);
    public void addProduct(ProductTableEntity newProduct);
    public void updateProduct(ProductTableEntity existingProduct);
    public  void deleteProduct(ProductTableEntity existingProduct);
}
