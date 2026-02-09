package com.xworkz.apollo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.apollo")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is WebConfiguration");
    }

    @Bean
    public ViewResolver viewResolver(){
        System.out.println("this is viewResolver class");
        return new InternalResourceViewResolver("/",".jsp");
    }
}
