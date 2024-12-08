package com.example.shoponline.repository;

import com.example.shoponline.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
