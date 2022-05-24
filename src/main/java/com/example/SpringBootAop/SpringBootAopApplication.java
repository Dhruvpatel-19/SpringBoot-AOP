package com.example.SpringBootAop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAopApplication.class, args);

	/*	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);*/

		ShoppingCart cart = context.getBean(ShoppingCart.class);

		cart.checkout("status");
		System.out.println("------------------------------");
		cart.returnNum();
	}

}
