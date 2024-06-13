package com.springBoot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StartApplication.class, args);



		MyFirstClass myFirstClass = context.getBean("myFirstClass" ,MyFirstClass.class);
		myFirstClass.displayMessage();
	}
// dependency Injection:


}
