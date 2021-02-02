package com.acazia.demo.repository.custom;

import com.acazia.demo.domain.Product;

import java.util.List;

public interface ProductCustomRepository {
    List<Product> getAllByCategoryNameLike(String categoryName);
}
