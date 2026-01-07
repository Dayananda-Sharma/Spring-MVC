package com.xworkz.rapido.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.rapido")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is a web Configuration");
    }
}
