package com.acazia.demo.repository;

import com.acazia.demo.domain.Product;

import com.acazia.demo.repository.custom.ProductCustomRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, ProductCustomRepository {

}
