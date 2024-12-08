package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.IProductService;
import com.example.shoponline.model.Categorie;
import com.example.shoponline.model.Product;
import com.example.shoponline.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImplementation implements IProductService {
    @Autowired
    private ProductRepository productRepo;
    @Override
    public List<Product> getAllProducts() {
        return (List<Product>)productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> op = productRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Product avec l'Id "+ id +"n'existe pas");
        }
    }


    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }
}
