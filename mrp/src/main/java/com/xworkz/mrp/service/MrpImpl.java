package com.xworkz.mrp.service;

import org.springframework.stereotype.Service;

@Service
public class MrpImpl implements Mrp{
    @Override
    public void displayInterface() {
        System.out.println("this is implement class");
    }
}
