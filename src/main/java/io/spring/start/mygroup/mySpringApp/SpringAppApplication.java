package io.spring.start.mygroup.mySpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import io.spring.start.mygroup.mySpringApp.component.DemoBean;
import io.spring.start.mygroup.mySpringApp.component.EmployeeBean;

@SpringBootApplication
public class SpringAppApplication {
	public static final Logger logger =LoggerFactory.getLogger(SpringAppApplication.class);
	public static void main(String[] args)
	{
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context=SpringApplication.run(SpringAppApplication.class, args);
		logger.debug("Checking Context:{}",context.getBean(DemoBean.class));
		logger.debug("\n*** Example using @Autowire annotation on property***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
		
	}
}
