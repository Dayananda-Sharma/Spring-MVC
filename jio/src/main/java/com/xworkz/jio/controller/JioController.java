package com.xworkz.jio.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JioController {
    public JioController(){
        System.out.println("this is Controller class");
    }@GetMapping("sim")
    public String jioStar(){
        return "JioSim";
    }
}
