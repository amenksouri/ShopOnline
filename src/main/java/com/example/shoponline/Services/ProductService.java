package com.example.shoponline.Services;

import com.example.shoponline.Interfaces.ICategorie;
import com.example.shoponline.Interfaces.IProduct;
import com.example.shoponline.Repository.CategorieRepository;
import com.example.shoponline.Repository.ProductRepository;
import com.example.shoponline.model.Categorie;
import com.example.shoponline.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProduct {



        @Autowired
        private ProductRepository productRepository;

        @Override
        public void AddProduct(Product product) {
            productRepository.save(product);
        }

        @Override
        public void UpdateProduct(Product product) {
            productRepository.save(product);
        }

        @Override
        public void DeleteProduct(Long id) {
            productRepository.deleteById(id);
        }

        @Override
        public Product GetProductById(Long id) {
            return productRepository.findById(id).orElse(null);
        }

        @Override
        public List<Product> GetAllProducts() {
            return productRepository.findAll();
        }

}
