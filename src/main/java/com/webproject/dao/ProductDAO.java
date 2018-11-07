package com.webproject.dao;

import com.webproject.entity.ProductTableEntity;

import java.util.ArrayList;

public interface ProductDAO {
    public ArrayList<ProductTableEntity> getAllProducts();
    public void addProduct(ProductTableEntity newProduct);
    public void updateProduct(ProductTableEntity existingProduct);
    public  void deleteProduct(ProductTableEntity existingProduct);
}
