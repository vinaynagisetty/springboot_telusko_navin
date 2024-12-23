package com.vinay_nagisetty.learning_springboot_from_telusko;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //for  giving priority for whhich bean need to assign
@Qualifier("desk")//for  giving priority for whhich bean need to assign
public class Desktop  implements Computer{
    public void compile(){
        System.out.println("compiled on laptop");
    }
}
