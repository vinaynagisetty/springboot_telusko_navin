package com.vinay_nagisetty.learning_springboot_from_telusko.controller;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import com.vinay_nagisetty.learning_springboot_from_telusko.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
