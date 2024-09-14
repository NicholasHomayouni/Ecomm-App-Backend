package com.CircuitFlux.ecomm_app_backend.controller;

import com.CircuitFlux.ecomm_app_backend.entity.Category;
import com.CircuitFlux.ecomm_app_backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping
    public List<Category> getSubcategoriesByCategory(@RequestParam String category) {
        return categoryRepo.findByCategory(category);
    }

//    @GetMapping("/{subcategory}")
//    public Category getSubcategoryDetails(@RequestParam String category, @PathVariable String subcategory) {
//        return categoryRepo.findByCategoryAndSubcategory(category, subcategory);
//    }
}
