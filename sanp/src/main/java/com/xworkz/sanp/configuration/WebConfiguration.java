package com.xworkz.sanp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.snap")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this Web Configuration class");
    }
}
