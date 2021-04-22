package com.eddperpich.augury.zprofiles.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SuppressWarnings("unused")
@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
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
