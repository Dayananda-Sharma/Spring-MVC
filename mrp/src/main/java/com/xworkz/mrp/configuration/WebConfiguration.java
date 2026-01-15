package com.xworkz.mrp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mrp")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is web configuration");
    }
}
