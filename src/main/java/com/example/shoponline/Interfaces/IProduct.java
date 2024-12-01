package com.example.shoponline.Interfaces;

import com.example.shoponline.model.Categorie;
import com.example.shoponline.model.Product;

import java.util.List;

public interface IProduct {

    public void  AddProduct(Product product);
    public void  UpdateProduct(Product product);
    public void  DeleteProduct(Long id);


    public Product GetProductById(Long id);
    public List<Product> GetAllProducts();
}
