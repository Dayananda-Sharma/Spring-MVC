package com.xworkz.mrf.controller;

import com.xworkz.mrf.dto.MrfDto;
import com.xworkz.mrf.service.MrfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MrfController {

    @Autowired
    MrfDto mrfDto;

    @Autowired
    MrfService mrfService;

    public MrfController(){
        System.out.println("this is MRF controller");
    }
    @GetMapping("/mrf")
public String controller(@RequestParam String name){
        mrfService.displayInterface();
    System.out.println("controller method called.."+name);

    return "index.jsp";
}
}
