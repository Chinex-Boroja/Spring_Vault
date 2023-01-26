package com.chinex.spring_starter.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("yoruba")
public class HelloWorldServiceYorubaImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "E kaaro";
    }
}
