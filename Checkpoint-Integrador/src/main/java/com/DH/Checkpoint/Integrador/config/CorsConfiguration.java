package com.DH.Checkpoint.Integrador.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            //liberando app cliente 1
            registry.addMapping("/**")
                    .allowedOrigins("https://ctdiii-checkpoint-final.vercel.app/")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");

            //liberando app cliente 2
            registry.addMapping("/topicos/**")
                    .allowedOrigins("http://localhost:4000")
                    .allowedMethods("GET", "OPTIONS", "HEAD", "TRACE", "CONNECT");
        }
    }


