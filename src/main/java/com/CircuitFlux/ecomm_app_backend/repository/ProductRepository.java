package com.CircuitFlux.ecomm_app_backend.repository;

import com.CircuitFlux.ecomm_app_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();

    List<Product> findByCategory(String category);

    List<Product> findByCategoryAndSubcategory(String category, String subcategory);

    @Query("SELECT DISTINCT p.subcategory FROM Product p WHERE p.category = :category")
    List<String> findDistinctSubcategoriesByCategory(@Param("category") String category);
}
