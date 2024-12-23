package com.vinay_nagisetty.learning_springboot_from_telusko.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private  int price;


}
