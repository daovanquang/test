package com.acazia.demo.service.dto;

import com.acazia.demo.domain.Product;

import java.io.Serializable;

public class ProductDTO implements Serializable{

    private Long id;

    private String name;

    private String categoryTag;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.categoryTag = product.getCategoryTag();
        this.price = product.getPrice();
    }
}
