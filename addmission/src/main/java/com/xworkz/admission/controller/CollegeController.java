package com.xworkz.admission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CollegeController {

    @GetMapping("/college")
    public String college(@RequestParam String college){
        System.out.println("this is controller"+college);
        return "college";
    }
    @GetMapping("/name")
    public String name(@RequestParam String name){
        System.out.println("this is controller"+name);
        return "name";
    }
    @GetMapping("/Address")
    public String Address(@RequestParam String Address){
        System.out.println("this is controller"+Address);
        return "Address";
    }
    @GetMapping("/Parent")
    public String Parent(@RequestParam String Parent){
        System.out.println("this is controller"+Parent);
        return "Parent";
    }
    @GetMapping("/degree")
    public String degree(@RequestParam String degree){
        System.out.println("this is controller"+degree);
        return "degree";
    }
    @GetMapping("/year")
    public String year(@RequestParam String year){
        System.out.println("this is controller"+year);
        return "year";
    }
    @GetMapping("/contact")
    public String contact(@RequestParam String contact){
        System.out.println("this is controller"+contact);
        return "contact";
    }
    @GetMapping("/city")
    public String city(@RequestParam String city){
        System.out.println("this is controller"+city);
        return "city";
    }
    @GetMapping("/application")
    public String application(@RequestParam String application){
        System.out.println("this is controller"+application);
        return "application";
    }

}
