package com.xworkz.phonepay.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.phonepay")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is web WebConfiguration class");
    }@Bean
    public ViewResolver viewResolver(){
        System.out.println("this is method");
        return new InternalResourceViewResolver("/",".jsp");
    }

}
