package io.spring.start.mygroup.mySpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import io.spring.start.mygroup.mySpringApp.component.DemoBean;

@SpringBootApplication
public class SpringAppApplication {
	public static final Logger logger =LoggerFactory.getLogger(SpringAppApplication.class);
	public static void main(String[] args)
	{
		logger.debug("Welcome to Spring Concept Demo");
		logger.info("Welcome to Spring Concept Demo");
		logger.error("Welcome to Spring Concept Demo");
		logger.warn("Welcome to Spring Concept Demo");
		logger.trace("Welcome to Spring Concept Demo");

		/* level = TRACE will print TRACE,DEBUG,WARN,ERROR,INFO messages
		 * level = DEBUG will print DEBUG,WARN,ERROR,INFO messages
		 * level = INFO will print WARN,ERROR,INFO messages
		 * level = WARN will print WARN,ERROR messages
		 * level = ERROR will print ERROR messages
		 */

		ApplicationContext context=SpringApplication.run(SpringAppApplication.class, args);
		logger.debug("Checking Context:"+context.getBean(DemoBean.class));
		logger.debug("\n*** Example using @Autowire annotation on property***");
	}
}
