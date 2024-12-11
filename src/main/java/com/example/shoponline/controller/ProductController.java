package com.example.shoponline.controller;

import com.example.shoponline.Service.IProductService;
import com.example.shoponline.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;


    @GetMapping("/")
    public String indexPage() {
        return "index";
    }
    @GetMapping("/add")
    public String showRegistration() {
        return "addProduct";
    }
    @PostMapping("/save")
    public String saveProduct(
            @ModelAttribute Product product, Model model
    ) {
        productService.addProduct(product);
        Long id = (long) productService.addProduct(product).getId();
        String message = "Record with id : '"+id+"' is saved successfully !";
        model.addAttribute("message", message);
        return "addProduct";
    }


    @GetMapping("/getAllProducts")
    public String getAllProducts(
            @RequestParam(value = "message", required = false)
            String message,
            Model model
    ) {
        List<Product> products= productService.getAllProducts();
        model.addAttribute("list", products );
        model.addAttribute("message", message);
        return "store";
    }


}
