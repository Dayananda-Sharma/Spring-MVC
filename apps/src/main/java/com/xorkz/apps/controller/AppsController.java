package com.xorkz.apps.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppsController {
    public AppsController(){
        System.out.println("this is AppsController");
    }
@GetMapping("/apps")
    public String apps(){
        System.out.println("this is String  controller method");
        return "apps.jsp";
    }
}