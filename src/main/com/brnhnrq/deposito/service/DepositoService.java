package com.brnhnrq.deposito.service;

import com.brnhnrq.deposito.entity.Products;

import java.util.List;

public interface DepositoService {
    public Products getProductById(int id);
    public List<Products> getAllProducts();
    public void deleteProduct(int id);
    public void addProduct(Products products);
}
