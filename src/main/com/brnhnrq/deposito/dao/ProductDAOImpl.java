package com.brnhnrq.deposito.dao;

import com.brnhnrq.deposito.entity.Products;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{

    @Autowired
    SessionFactory sessionFactory;

    public Products getProductById(int id) {

        Session session = sessionFactory.getCurrentSession();

        Products products = session.get(Products.class, id);

        return products;
    }

    public List<Products> getAllProducts() {

        Session session = sessionFactory.getCurrentSession();

        Query<Products> query = session.createQuery("from Products order by productCategory", Products.class);

        List<Products> products = query.getResultList();

        return products;
    }

    public void deleteProduct(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Products> query = session.createQuery("Delete from Products where id=:prodId");
        query.setParameter("prodId", id);
        
        query.executeUpdate();
    }

    public void addProduct(Products products) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(products);
    }
}
