/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proj1309.config;

import com.mongodb.MongoClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 *
 * @author utente
 */
@Configuration
@ComponentScan(basePackages = "com.example.proj1309")
public class AppConfig {
    
     private Properties prop;
    
    public  AppConfig() throws IOException{
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("application.properties");
        this.prop = new Properties();
        prop.load(inputStream);
    }
    
    public @Bean MongoClient mongoClient() {
        String host = prop.getProperty("spring.data.mongodb.host");
        int port = Integer.parseInt(prop.getProperty("spring.data.mongodb.port"));
        return new MongoClient(host,port);
    }
    
    public @Bean MongoTemplate mongoTemplate()  {
        String dbname = prop.getProperty("spring.data.mongodb.database");
        return new MongoTemplate(mongoClient(), dbname);
    }
}
