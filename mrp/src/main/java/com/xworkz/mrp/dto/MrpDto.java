package com.xworkz.mrp.dto;

import org.springframework.stereotype.Component;

@Component
public class MrpDto {
    private String name;
    private String location;
    public MrpDto(){
        System.out.println("this is Mrp Dto");
    }
}
