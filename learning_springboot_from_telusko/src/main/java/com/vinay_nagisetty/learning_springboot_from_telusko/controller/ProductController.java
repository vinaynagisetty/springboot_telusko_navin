package com.vinay_nagisetty.learning_springboot_from_telusko.controller;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import com.vinay_nagisetty.learning_springboot_from_telusko.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addProduct(@Valid @RequestBody Product product) {
        products.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product Added Successfully!");
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
