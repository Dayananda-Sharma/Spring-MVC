package com.xworkz.vega.service;

import org.springframework.stereotype.Service;

@Service
public class VegaService implements Vega{

    @Override
    public void displayVega() {
        System.out.println("this is Service method");
    }
}
