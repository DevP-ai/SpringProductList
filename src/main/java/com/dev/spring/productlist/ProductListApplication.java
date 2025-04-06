package com.dev.spring.productlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductListApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProductListApplication.class, args);

		//Let MyComponent is a third party library
		App app = context.getBean(App.class);
		app.run();

		//Object Create using @Component annotation
		/**
		 * 	ConfigurableApplicationContext context = SpringApplication.run(ProductListApplication.class, args);
		 * 	MyComponent myComponent = context.getBean(MyComponent.class);
		 * 	myComponent.getMessage();
		 * **/




		//Normal object creation
		/**
		 * SpringApplication.run(ProductListApplication.class, args);
		 * MyComponent myComponent = new MyComponent();
		 * myComponent.getMessage();
		 * **/
	}

}
