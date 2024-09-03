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
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Product() {}

    public Product(Integer productId, String productName, double price, Integer quantity, String description, Date creationDate) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.creationDate = new Date();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
