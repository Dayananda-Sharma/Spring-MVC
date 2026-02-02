package com.xworkz.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Employee {

    @GetMapping("employee")
    public String employee(){
        return "employee";
    }
    @GetMapping("location")
    public String location(){
        return "location";
    }
    @GetMapping("salary")
    public String salary(){
        return "salary";
    }
    @GetMapping("mother")
    public String mother(){
        return "mother";
    }
    @GetMapping("father")
    public String father(){
        return "father";
    }
}
