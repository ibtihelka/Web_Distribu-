package com.example.Reclamation;

import com.example.Reclamation.Entity.Reclamation;
import com.example.Reclamation.Repository.ReclamationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ReclamationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclamationApplication.class, args);
	}


	@Autowired
	private ReclamationRepo reclamationRepo;
	@Bean
	ApplicationRunner init(ReclamationRepo reclamationRepo) {
		return (args) -> {
			reclamationRepo.save(new Reclamation("objet1", "desc1"));
			reclamationRepo.save(new Reclamation("objet2", "desc2"));
			reclamationRepo.save(new Reclamation("objet3", "desc3"));
			reclamationRepo.findAll().forEach(System.out::println);
		};
	}
}
