package com.xworkz.seva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SevaController {

    @GetMapping("/application")
    public String application(@RequestParam String application){
        System.out.println("Personal details=="+application);
        return "application";
    }
    @GetMapping("/course")
    public String course(@RequestParam String degree){
        System.out.println("course details=="+degree);
        return "course";
    }
    @GetMapping("/name")
    public String name(@RequestParam String name){
        System.out.println("Personal details=="+name);
        return "name";
    }
    @GetMapping("/father")
    public String father(@RequestParam String father){
        System.out.println("Personal details=="+father);
        return "father";
    }
    @GetMapping("/mother")
    public String mother(@RequestParam String mother){
        System.out.println("Personal details=="+mother);
        return "mother";
    }
    @GetMapping("/age")
    public String age(@RequestParam String age){
        System.out.println("Personal details=="+age);
        return "age";
    }
    @GetMapping("/mobile")
    public String mobile(@RequestParam String mobile){
        System.out.println("Personal details=="+mobile);
        return "mobile";
    }
    @GetMapping("/aadhaar")
    public String aadhaar(@RequestParam String aadhaar){
        System.out.println("Personal details=="+aadhaar);
        return "aadhaar";
    }
    @GetMapping("/location")
    public String location(@RequestParam String location){
        System.out.println("Personal details=="+location);
        return "location";
    }

}
