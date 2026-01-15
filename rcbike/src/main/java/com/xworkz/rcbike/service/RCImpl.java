package com.xworkz.rcbike.service;

import org.springframework.stereotype.Service;

@Service
public class RCImpl implements RC{
    @Override
    public void interfaceMethod() {
        System.out.println("this is interface method`");
    }
}
