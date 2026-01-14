package com.xorkz.apps.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xorkz.apps")

public class Webconfiguration {
    public Webconfiguration(){
        System.out.println("this is Web Configuration");
    }


}
