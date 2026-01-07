package com.xworkz.hp.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("its getRootConfigClasses method");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println(" its getServletConfigClasses method");
        return new Class[]{ WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("its a getServletMappings method");
        return new String[]{"/"};
    }
@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer){
        defaultServletHandlerConfigurer.enable();
    }
}
