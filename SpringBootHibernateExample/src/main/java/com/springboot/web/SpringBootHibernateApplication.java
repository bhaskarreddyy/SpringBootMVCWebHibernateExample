package com.springboot.web;

/*
 * We have just added @SpringBootApplication and it does all the work.
Let’s understand more about this annotation.
@SpringBootApplication is an annotation that adds all of the following:

@Configuration makes the class as a source of bean definitions for the application context.

@EnableAutoConfiguration enables Spring boot to add beans presents in classpath setting and various property setting.
Normally you would add

@EnableWebMvc for a Spring MVC application, but Spring Boot adds it automatically 
when it sees spring-webmvc on the classpath.This flags the application as a web application and 
activates key behaviors such as setting up a DispatcherServlet.

@ComponentScan tells Spring to look for other components, configurations, and services in the default package, 
allowing it to find the controllers.
If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class SpringBootHibernateApplication {
 
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHibernateApplication.class, args);   
	}
}
 