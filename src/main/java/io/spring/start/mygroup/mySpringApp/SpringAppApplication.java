package io.spring.start.mygroup.mySpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring concept demo ");
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
