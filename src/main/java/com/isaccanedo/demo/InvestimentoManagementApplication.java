package com.isaccanedo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.isaccanedo")
@ComponentScan("com.isaccanedo")
@EnableJpaRepositories("com.isaccanedo")
public class InvestimentoManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestimentoManagementApplication.class, args);
	}

}
