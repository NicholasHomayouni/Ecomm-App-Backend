package com.CircuitFlux.ecomm_app_backend.repository;

import com.CircuitFlux.ecomm_app_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
