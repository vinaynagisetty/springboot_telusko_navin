package com.vinay_nagisetty.learning_springboot_from_telusko.controller;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import com.vinay_nagisetty.learning_springboot_from_telusko.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService products;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return products.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.getProductById(id);
    }
    @PostMapping("/products")
    public String addProduct( @RequestBody Product product) {
         products.addProduct(product);
         return "Product Added Successfully!";
    }
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        products.updateProduct(product);
        return "Product Updated Successfully!";
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        products.deleteProduct(id);
        return "Product Deleted Successfully!";
    }

}
