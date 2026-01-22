package com.xworkz.politics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("com.xworkz.politics")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is configuration class");
    }
    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
    @PostConstruct
    public void init(){
        System.out.println(" initializer method called");
    }
}
