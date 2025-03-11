package com.laurynislearning.redisspringbootcrud.service;

import com.laurynislearning.redisspringbootcrud.model.Product;
import com.laurynislearning.redisspringbootcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Cacheable(value = "products", key = "#id")
    public Optional<Product> getProductById(Long id) {
        System.out.println("Fetching product from database...");
        return productRepository.findById(id);
    }

    @CachePut(value = "products", key = "#id")
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    @CacheEvict(value = "products", key = "#id")
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}