package com.chinex.spring_starter;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {

    public void sayHello() {
        System.out.println("Hello Boroja!!!");
    }
}
