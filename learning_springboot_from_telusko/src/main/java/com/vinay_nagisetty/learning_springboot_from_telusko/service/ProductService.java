package com.vinay_nagisetty.learning_springboot_from_telusko.service;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(1, "Laptop", 1000),
            new Product(2, "Mouse", 20),
            new Product(3, "Keyboard", 50)
    );
    public List<Product> getProducts() {
        return products;
    }
}