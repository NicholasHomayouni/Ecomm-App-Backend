package com.CircuitFlux.ecomm_app_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"category", "subcategory"})
})
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "subcategory", nullable = false)
    private String subcategory;

    @Column(name = "image_url")
    private String imageUrl;

    public Category() {}

    public Category(String category, String subcategory, String imageUrl) {
        this.category = category;
        this.subcategory = subcategory;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
