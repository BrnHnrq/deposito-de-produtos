package com.brnhnrq.deposito.dao;

import com.brnhnrq.deposito.entity.Products;

import java.util.List;

public interface ProductDAO {
    public Products getProductById(int id);
    public List<Products> getAllProducts();
    public void deleteProduct(int id);
    public void addProduct(Products products);
}
