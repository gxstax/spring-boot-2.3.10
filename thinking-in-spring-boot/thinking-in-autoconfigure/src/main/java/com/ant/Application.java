package com.ant;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/05 4:17 下午
 **/
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext) SpringApplication.run(Application.class, args);

		Object ant = context.getBean("ant");
		System.out.println(ant);
	}

	@Bean
	public String ant() {
		return "Ant";
	}
}
