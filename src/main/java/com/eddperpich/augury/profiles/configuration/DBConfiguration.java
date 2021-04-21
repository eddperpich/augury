package com.eddperpich.augury.profiles.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {
    private String url;
    private String username;
    private String password;
    @Profile("local")
    @Bean
    public String localDatabaseConnection() {
        return "Local connection";
    }

    @Profile("live")
    @Bean
    public String liveDatabaseConnection() {
        return "Live connection";
    }
}
