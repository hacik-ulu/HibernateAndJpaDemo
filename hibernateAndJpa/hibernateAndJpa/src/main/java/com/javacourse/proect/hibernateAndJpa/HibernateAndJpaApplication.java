package com.javacourse.proect.hibernateAndJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@EnableAutoConfiguration
@SpringBootApplication
public class HibernateAndJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateAndJpaApplication.class, args);
	}

}
