package com.xworkz.mrp.controller;

import com.xworkz.mrp.dto.MrpDto;
import com.xworkz.mrp.service.MrpImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MrpController {
    @Autowired
    MrpDto mrpDto;
    @Autowired
    MrpImpl mrpimpl;

    public MrpController(){
        System.out.println("this is Mrp Controller");

    }
    @GetMapping("/mrp")
    public String wine(@RequestParam String name){
        mrpimpl.displayInterface();
        System.out.println("this is wine Controller"+name);
        return "index.jsp";
    }
}
