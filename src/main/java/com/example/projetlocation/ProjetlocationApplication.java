package com.example.projetlocation;

import com.example.projetlocation.ENTITIES.Visite;
import com.example.projetlocation.REPOSITORY.Visiterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class ProjetlocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetlocationApplication.class, args);
    }
    @Autowired
    private Visiterepo visiterepo;
    @Bean
    ApplicationRunner init() {
        return args ->{
            visiterepo.findAll().forEach(System.out::println);

        };
    }



}
