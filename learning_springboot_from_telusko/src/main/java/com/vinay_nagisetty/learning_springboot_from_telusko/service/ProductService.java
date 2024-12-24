package com.vinay_nagisetty.learning_springboot_from_telusko.service;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import com.vinay_nagisetty.learning_springboot_from_telusko.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
 private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


//    List<Product> products= new ArrayList<>( Arrays.asList(
//            new Product(1, "Laptop", 1000),
//            new Product(2, "Mouse", 20),
//            new Product(3, "Keyboard", 50)
//    ));
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
