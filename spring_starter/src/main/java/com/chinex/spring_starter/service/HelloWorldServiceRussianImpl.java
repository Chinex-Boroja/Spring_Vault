package com.chinex.spring_starter.service;

//@Component
//@Profile("default")
//@Profile({"default","english"}) you can pass in a list of profiles
public class HelloWorldServiceRussianImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "dobroye utro";
    }
}
