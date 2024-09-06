package com.CircuitFlux.ecomm_app_backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "product_id", nullable = false, updatable = false)
    private Integer productId;

    @Column(name = "product_name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "category")
    private String category;

    @Column(name = "subcategory")
    private String subcategory;

    public Product() {}

    public Product(Integer productId, String name, double price, Integer quantity, String description, Date creationDate, String category, String subcategory) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.creationDate = new Date();
        this.category = category;
        this.subcategory = subcategory;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
}
