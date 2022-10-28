package com.brnhnrq.deposito.service;

import com.brnhnrq.deposito.dao.ProductDAO;
import com.brnhnrq.deposito.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepositoServiceImpl implements DepositoService{

    @Autowired
    ProductDAO productDAO;

    @Transactional
    public Products getProductById(int id) {
        return productDAO.getProductById(id);
    }
    @Transactional
    public List<Products> getAllProducts() {
        return productDAO.getAllProducts();
    }
    @Transactional
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
    @Transactional
    public void addProduct(Products products) {
        productDAO.addProduct(products);
    }
}
