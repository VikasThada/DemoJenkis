package com.example.demojenkis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoJenkisApplication {

   public static Logger logger= LoggerFactory.getLogger(DemoJenkisApplication.class);
   @PostConstruct
   public void init()
   {
       logger.info("Inside init method initialized");
   }
    public static void main(String[] args) {

       logger.info("Main method executed");
       SpringApplication.run(DemoJenkisApplication.class, args);
    }

}
