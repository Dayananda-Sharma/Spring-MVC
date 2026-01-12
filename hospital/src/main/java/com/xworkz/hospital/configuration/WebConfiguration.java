package com.xworkz.hospital.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hospital")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is Web configuration class");
    }
    @Bean
    public String hospital(){
        System.out.println("this is control class");

        return "";
    }
}
