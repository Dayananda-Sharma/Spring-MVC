package com.xworkz.vega.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.vega")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is web Configuration");
    }

}
