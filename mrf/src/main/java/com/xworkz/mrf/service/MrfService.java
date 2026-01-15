package com.xworkz.mrf.service;

import org.springframework.stereotype.Service;

@Service
public class MrfService implements MRF {


    @Override
    public void displayInterface() {
        System.out.println("this is impelement class ");
    }
}
