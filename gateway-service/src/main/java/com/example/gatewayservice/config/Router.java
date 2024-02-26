package com.example.gatewayservice.config;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class Router {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service", predicate -> predicate.path("/api/client/**")
                        .uri("lb://CLIENT-SERVICE"))
                .route("updater", predicate -> predicate.path("/api/update/**")
                        .uri("lb://UPDATE-SERVICE"))
                .build();
    }
}
