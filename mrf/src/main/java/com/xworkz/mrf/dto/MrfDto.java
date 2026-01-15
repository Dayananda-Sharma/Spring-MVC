package com.xworkz.mrf.dto;

import org.springframework.stereotype.Component;

@Component
public class MrfDto {
    private String name;
    private Integer price;

    public MrfDto() {
        System.out.println("this is mrf dto");
    }

}
