package com.xworkz.nsp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.nsp")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is Web Configuration");
    }
    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
}
