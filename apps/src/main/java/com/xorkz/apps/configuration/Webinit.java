package com.xorkz.apps.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Webinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public Webinit(){
        System.out.println("this is init method");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("this is getRootConfigClasses method");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("this is getServletConfigClasses method");
        return new Class[]{Webconfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("this is getServletMappings method");
        return new String[]{"/"};
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer dc){
        dc.enable();
    }
}
