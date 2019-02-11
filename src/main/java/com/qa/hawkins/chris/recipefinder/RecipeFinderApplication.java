package com.qa.hawkins.chris.recipefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RecipeFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeFinderApplication.class, args);
	}

}
