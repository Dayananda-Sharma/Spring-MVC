package com.xworkz.mrf.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mrf")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is Web configuration class");
    }
}
