package com.xworkz.hp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hp")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println(" this is a Web Configuration class");
    }
}
