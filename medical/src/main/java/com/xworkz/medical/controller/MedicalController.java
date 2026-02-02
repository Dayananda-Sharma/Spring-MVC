package com.xworkz.medical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MedicalController {

    @GetMapping("medical")
    public String medical(){
        return "medical";
    }
    @GetMapping("medicalDetails")
    public String medicalDetails(){
        return "medicalDetails";
    }
    @GetMapping("owner")
    public String owner(){
        return "owner";
    }
    @GetMapping("surgery")
    public String surgery(){
        return "surgery";
    }

    @GetMapping("emergency")
    public String emergency(){
        return "emergency";
    }

}
