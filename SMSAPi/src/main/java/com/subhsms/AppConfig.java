package com.subhsms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfig {

    @Bean//IT return the object of RestTemplate 
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}