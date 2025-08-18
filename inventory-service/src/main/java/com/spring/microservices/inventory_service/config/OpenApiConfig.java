package com.spring.microservices.inventory_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI inventoryServiceApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Inventory Service API")
                .version("1.0.0")
                .description("API documentation for the Inventory Service microservice")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")))
            .externalDocs(new ExternalDocumentation()
                .description("You can refer to the inventory service documentation at")
                .url("https://github.com/rajatmungra/java-shopping-microservices"));
    }
}
