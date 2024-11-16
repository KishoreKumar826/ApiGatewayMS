package com.example.APIGateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;

// this is for security currentl we disable it
@Configuration
public class ResourceServerConfig {

    // @Bean
    // @Order(1)
    // public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity httpSecurity) {
    //     httpSecurity.authorizeExchange().anyExchange().authenticated(); // all calls require token
    //     httpSecurity.oauth2ResourceServer(c -> c.jwt(jwtSpec -> jwtSpec.jwkSetUri("http://localhost:9090/oauth2/jwks")));

    //     return httpSecurity.build();
    // }
}
