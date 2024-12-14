package br.com.pires.atividade09.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Atividade 09 - Backend RESTful").version("1.0")
                .license(new License().name("Lincença do Sistema").url("https://github.com/matheus3pires/Atividade-09"))
        );
    }
}
