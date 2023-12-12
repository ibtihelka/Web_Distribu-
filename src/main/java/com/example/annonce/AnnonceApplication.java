package com.example.annonce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class AnnonceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnonceApplication.class, args);
    }

    @Autowired
    private AnnonceRepository annonceRepository;
    @Bean
    ApplicationRunner init(){
        return (args )-> {
            annonceRepository.save(new Annonce("hhh", "pmml,", "iiii"));
            annonceRepository.save(new Annonce("hhhu", "pmiml,", "iiiyi"));

            annonceRepository.save(new Annonce("hwwhh", "pmppml,", "iiimmi"));

            annonceRepository.findAll().forEach(System.out::println);
        };
    }
}
