package com.acazia.demo.service.impl;

import com.acazia.demo.domain.Product;
import com.acazia.demo.repository.ProductRepository;
import com.acazia.demo.service.ProductService;
import com.acazia.demo.service.dto.ProductDTO;
import com.acazia.demo.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDTO> getProductsByCategoryName(String categoryName) {
        List<Product> products = productRepository.getAllByCategoryNameLike(categoryName);
        return productMapper.productsToProductDTOs(products);
    }
}
