package com.chinex.spring_starter.service;

public class HelloWorldFactory {
     public HelloWorldService createHelloWorldService(String language) {
         HelloWorldService service = null;

         switch (language) {
             case "ig":
                 service = new HelloWorldServiceIgboImpl();
                 break;
             case "yr":
                 service = new HelloWorldServiceYorubaImpl();
                 break;
             case "de":
                 service = new HelloWorldServiceGermanImpl();
                 break;
             case "fr":
                 service = new HelloWorldServiceFrenchImpl();
                 break;
             case "pl":
                 service = new HelloWorldServicePolishImpl();
                 break;
             case "ru":
                 service = new HelloWorldServiceRussianImpl();
                 break;
             default: new  HelloWorldServiceIgboImpl();
         }
         return service;
     }
}
