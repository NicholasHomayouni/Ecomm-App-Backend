package com.CircuitFlux.ecomm_app_backend.repository;

import com.CircuitFlux.ecomm_app_backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findByCategory(String category);

    Category findByCategoryAndSubcategory(String category, String subcategory);
}
