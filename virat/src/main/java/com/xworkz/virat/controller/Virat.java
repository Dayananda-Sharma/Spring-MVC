package com.xworkz.virat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Virat {
    @GetMapping("resp1")
    public String resp1(){
        return "resp1";
    }
    @GetMapping("resp2")
    public String resp2(){
        return "resp2";
    }
    @GetMapping("resp3")
    public String resp3(){
        return "resp3";
    }
    @GetMapping("resp4")
    public String resp4(){
        return "resp4";
    }
    @GetMapping("resp5")
    public String resp15(){
        return "resp5";
    }
}
