package com.dev.spring.productlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductListApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProductListApplication.class, args);
		MyComponent myComponent = context.getBean(MyComponent.class);
		myComponent.getMessage();
		//Normal object creation
		/**
		 * MyComponent myComponent = new MyComponent();
		 * myComponent.getMessage();
		 * **/
	}

}
