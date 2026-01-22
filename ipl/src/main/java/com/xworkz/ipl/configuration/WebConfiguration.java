package com.xworkz.ipl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("com.xworkz.ipl")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is Web configuration class");
    }
    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
    @PostConstruct
    public void init(){
        System.out.println("Init method called");
    }

}
