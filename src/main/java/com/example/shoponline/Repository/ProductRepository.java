package com.example.shoponline.Repository;

import com.example.shoponline.model.Categorie;
import com.example.shoponline.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}