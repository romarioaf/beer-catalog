package com.romasdev.beercatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringBootBeerCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeerCatalogApplication.class, args);
	}
}
