package com.xworkz.hospital.configuration.internal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
    public Hospital(){
        System.out.println("this is hospital class");
    }
}
