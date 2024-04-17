package com.hotel.trivoli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
// @EnableSwagger2
public class SwaggerConfig {
        @Bean
        public OpenAPI customOpenAPI() {
                return new OpenAPI()
                                .info(new Info()
                                                .title("Trivoli API").description("API de trivoli").version("1.0.0")
                                                .contact(new Contact()
                                                                .name("Jhonatan Petro").url(
                                                                                "https://portfolio-sure--portfolio-sure.netlify.app/")
                                                                .email("Jpetroruiz@gmail.com")));
        }
}
