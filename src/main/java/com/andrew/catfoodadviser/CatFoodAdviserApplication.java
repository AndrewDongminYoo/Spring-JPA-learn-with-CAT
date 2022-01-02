package com.andrew.catfoodadviser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CatFoodAdviserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatFoodAdviserApplication.class, args);
    }

}
