package com.acazia.demo.web.rest;

import com.acazia.demo.domain.Product;
import com.acazia.demo.repository.ProductRepository;
import com.acazia.demo.service.ProductService;
import com.acazia.demo.service.dto.ProductDTO;
import com.acazia.demo.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.acazia.demo.domain.Product}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class ProductResource {

    private final Logger log = LoggerFactory.getLogger(ProductResource.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    @Autowired
    private ProductService productService;

    @GetMapping("/products/categories/{categoryName}")
    public List<ProductDTO> searchProductsByCategoryName(@PathVariable String categoryName) {
        log.debug("REST request to get Products by category name : {}", categoryName);
        List<ProductDTO> productDTOS = productService.getProductsByCategoryName(categoryName);
        return productDTOS;
    }
}
