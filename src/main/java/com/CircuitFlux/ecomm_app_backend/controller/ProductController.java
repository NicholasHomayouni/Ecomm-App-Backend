package com.CircuitFlux.ecomm_app_backend.controller;

import com.CircuitFlux.ecomm_app_backend.entity.Product;
import com.CircuitFlux.ecomm_app_backend.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    ProductRepository productRepo;

    public ProductController(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/marinefish")
    public ResponseEntity<List<String>> getAllMarineFish() {
        List<String> marineFishSubcategories = productRepo.findDistinctSubcategoriesByCategory("marine fish");
        return new ResponseEntity<>(marineFishSubcategories, HttpStatus.OK);
    }

    @GetMapping("/marinefish/{subcategory}")
    public ResponseEntity<List<Product>> getMarineFishBySubcategory(@PathVariable String subcategory) {
        List<Product> marineFishSubs = productRepo.findByCategoryAndSubcategory("marine fish", subcategory);
        return new ResponseEntity<>(marineFishSubs, HttpStatus.OK);
    }

    @GetMapping("/freshwaterfish")
    public ResponseEntity<List<Product>> getAllFreshwaterFish() {
        List<Product> freshwaterFish = productRepo.findByCategory("freshwater fish");
        return new ResponseEntity<>(freshwaterFish, HttpStatus.OK);
    }
}
