package com.chinex.spring_starter.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("igbo")
public class HelloWorldServiceIgboImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Ututu oma";
    }
}
