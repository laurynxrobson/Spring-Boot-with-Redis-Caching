package com.laurynislearning.redisspringbootcrud.repository;

import com.laurynislearning.redisspringbootcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}