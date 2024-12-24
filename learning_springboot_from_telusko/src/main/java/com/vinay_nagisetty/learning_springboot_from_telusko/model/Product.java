package com.vinay_nagisetty.learning_springboot_from_telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private  int price;


    public Product() {

    }


}
