package com.chinex.spring_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringStarterApplication {

    public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringStarterApplication.class, args);
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    helloWorld.sayHello();

    }

    // Add a method that sends a greeting
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
