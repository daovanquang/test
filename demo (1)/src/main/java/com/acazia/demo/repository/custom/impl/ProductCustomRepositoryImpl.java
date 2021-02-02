package com.acazia.demo.repository.custom.impl;

import com.acazia.demo.domain.Product;
import com.acazia.demo.repository.custom.ProductCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ProductCustomRepositoryImpl implements ProductCustomRepository {
    @Autowired
    private EntityManager em;

    @Override
    public List<Product> getAllByCategoryNameLike(String categoryName) {
        if(categoryName==null) {
            return new ArrayList<>();
        }

        StringBuilder sql = new StringBuilder("SELECT p.* ");
        sql.append("FROM product p LEFT JOIN category c ");
        sql.append("ON p.category_tag = c.tag ");
        sql.append("WHERE lower(c.name) LIKE lower(concat('%', :categoryName,'%')) ");
        sql.append("ORDER BY p.price DESC, p.name ASC ");

        Query query = em.createNativeQuery(sql.toString(), Product.class);
        query.setParameter("categoryName", categoryName);

        List<Product> products = query.getResultList();

        return products;
    }
}
