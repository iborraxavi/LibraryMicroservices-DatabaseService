package com.certiorem.librarymicroservicesproject.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.certiorem.librarymicroservicesproject")
@EnableJpaRepositories(basePackages = "com.certiorem.librarymicroservicesproject")
@EntityScan(basePackages = { "com.certiorem.librarymicroservicesproject.domain" })
public class DatabaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}

}
