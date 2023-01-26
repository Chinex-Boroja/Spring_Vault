package com.chinex.spring_starter.config;

import com.chinex.spring_starter.service.HelloWorldService;
import com.chinex.spring_starter.service.HelloWorldServiceIgboImpl;
import com.chinex.spring_starter.service.HelloWorldServiceYorubaImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloWorldConfig {
    @Bean
    @Profile("igbo")
    public HelloWorldService helloWorldServiceIgbo() {
        return new HelloWorldServiceIgboImpl();
    }
    @Bean
    @Profile("yoruba")
    public HelloWorldService helloWorldServiceYoruba() {
        return new HelloWorldServiceYorubaImpl();
    }

}
