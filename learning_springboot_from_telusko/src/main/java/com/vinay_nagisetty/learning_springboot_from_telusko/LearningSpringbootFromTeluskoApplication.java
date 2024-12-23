package com.vinay_nagisetty.learning_springboot_from_telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringbootFromTeluskoApplication {

	public static void main(String[] args) {


		ApplicationContext apj=SpringApplication.run(LearningSpringbootFromTeluskoApplication.class, args);
	    Dev obj=apj.getBean(Dev.class);
		obj.build();

	}

}
