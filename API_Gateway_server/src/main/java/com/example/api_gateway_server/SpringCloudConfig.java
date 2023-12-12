package com.example.api_gateway_server;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                // Micro-service 1
                .route("Reclamationservice",
                        r -> r.path("/reclamation/**")
                                .uri("http://localhost:8083/")
                )
                // Micro-service 2 - candidatservice
                .route("candidatservice",
                        r -> r.path("/candidatservice/**")
                                .uri("http://localhost:9098/")
                )
                .build();
    }
}
