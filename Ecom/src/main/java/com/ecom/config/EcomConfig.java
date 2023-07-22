package com.ecom.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EcomConfig {

    @Bean
    ModelMapper md() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        System.out.println("Demo");
    }

}
