package com.acazia.demo.service;

import com.acazia.demo.service.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProductsByCategoryName(String categoryName);
}
