package com.xworkz.metro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MetroController {
public MetroController(){
    System.out.println("this is controller constructor");
}
@GetMapping("/metro")
public String metro(){
    System.out.println("this is metro controller");
    return "metroresponse.jsp";
}
}
