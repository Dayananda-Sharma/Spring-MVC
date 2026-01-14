package com.xworkz.metro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MetroNotification {
    public MetroNotification(){
        System.out.println("this is MetroNotification method");
    }
    @GetMapping("/notification1")
    public String MetroNotificationMethod(){
        System.out.println("this controller method");
        return "metroid.jsp";
    }
}
