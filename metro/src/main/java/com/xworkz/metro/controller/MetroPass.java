package com.xworkz.metro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MetroPass {
    public MetroPass(){
        System.out.println("this pass method");
    }
    @GetMapping("/pass")
    public String Pass(){
        System.out.println("Pass method");
        return "metroid.jsp";
    }
}
