package com.example.shoponline.Service;

import com.example.shoponline.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public Product addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);

}
