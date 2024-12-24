package com.vinay_nagisetty.learning_springboot_from_telusko.repository;

import com.vinay_nagisetty.learning_springboot_from_telusko.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
