package com.xworkz.hospital.configuration.external;

import com.xworkz.hospital.configuration.WebConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HospitalServer {

    public HospitalServer(){
        System.out.println("this is HospitalServer class");
    }
}
