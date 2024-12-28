package com.vinay_nagisetty.learning_springboot_from_telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int id;
    @NotNull(message = "Product name is required")
    private String name;
    @NotNull(message = "Price cannot be null")
    @Min(value = 1, message = "Price must be greater than 0")
    private  Integer price;


    public Product() {

    }


}
