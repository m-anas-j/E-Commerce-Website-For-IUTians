package com.webproject.dao;

import com.webproject.entity.ProductTable;

import javax.annotation.Resource;
import java.util.ArrayList;

public interface ProductDAO {



  /*  Configuration con = new Configuration().configure("persistence.xml");
    SessionFactory sf = con.buildSessionFactory();
    Session session = sf.openSession();*/

    public ArrayList<ProductTable> getAllProducts();
    public void addProduct(ProductTable newProduct);
    public void updateProduct(ProductTable existingProduct);
    public  void deleteProduct(ProductTable existingProduct);
}
