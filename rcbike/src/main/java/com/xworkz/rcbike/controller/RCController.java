package com.xworkz.rcbike.controller;

import com.xworkz.rcbike.service.RCImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RCController {

    @Autowired
    RCImpl rc;

    public RCController(){
        System.out.println("this is RC controller ");
    }
    @GetMapping("/rc")
    public String bike(@RequestParam String name){
        rc.interfaceMethod();
        System.out.println("this is bike controller"+name);
        return "index.jsp";
    }
}
