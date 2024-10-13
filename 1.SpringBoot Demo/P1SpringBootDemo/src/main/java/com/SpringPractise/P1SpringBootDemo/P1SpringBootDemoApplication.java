package com.SpringPractise.P1SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class P1SpringBootDemoApplication {

	public static void main(String[] args) {
		//Creating a context to access beans from the container
		ApplicationContext context = SpringApplication.run
				(P1SpringBootDemoApplication.class, args);

		//getBean method helps to access the beans
		Alien obj = context.getBean(Alien.class);

		//accessing the members of Alien class
		obj.code();




	}

}
