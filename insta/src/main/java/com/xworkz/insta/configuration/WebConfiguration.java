package com.xworkz.insta.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.insta")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is Web configuration");
    }
}
