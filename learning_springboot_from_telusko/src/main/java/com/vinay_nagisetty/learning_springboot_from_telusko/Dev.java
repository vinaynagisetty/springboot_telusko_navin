package com.vinay_nagisetty.learning_springboot_from_telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("lap")
    private Computer computer;  //field injection

    //construction injection

//    public Dev(Computer computer){  //consturtor based injection and no need to mention @Autowired annotation
//        this.computer=computer;
//    }

//@Autowired
//    public void setComputer(Computer computer) {  //setter injection
//        this.computer = computer;
//    }

    public void build(){
        computer.compile();
        System.out.println("Hello from dev");
    }
}
