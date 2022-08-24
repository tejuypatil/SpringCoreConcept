package io.spring.start.mygroup.mySpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.spring.start.mygroup.mySpringApp.component.DemoBean;

@SpringBootApplication
public class SpringAppApplication {
	public static void main(String[] args)
	{
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context=SpringApplication.run(SpringAppApplication.class, args);
		System.out.println("Checking Context:"+context.getBean(DemoBean.class));
	}

}
