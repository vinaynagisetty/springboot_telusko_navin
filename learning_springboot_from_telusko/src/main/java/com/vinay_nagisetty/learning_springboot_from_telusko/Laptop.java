package com.vinay_nagisetty.learning_springboot_from_telusko;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
@Qualifier("lap")
public class Laptop implements Computer{
    public void compile(){
        System.out.println("compiled on laptop");
    }
}
