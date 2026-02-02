package com.xworkz.studentDetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {
    public StudentController(){
        System.out.println("this is controller class");
    }
    @GetMapping("student")
    public String student(){
        return "student";
    }
    @GetMapping("father")
    public String father(){
        return "father";
    }
    @GetMapping("mother")
    public String mother(){
        return "mother";
    }
    @GetMapping("school")
    public String school(){
        return "school";
    }
    @GetMapping("fee")
    public String fee(){
        return "fee";
    }

}
