package com.xworkz.apollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ApolloController {
    public ApolloController(){
        System.out.println("this is controller");
    }
    @GetMapping("/apollo")
    public String apollo(){
        return "apollo";
    }
    @GetMapping("sign")
    public String sign(){
        return "sign";
    }
}
