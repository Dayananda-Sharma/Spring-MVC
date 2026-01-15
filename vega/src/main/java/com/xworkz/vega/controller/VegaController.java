package com.xworkz.vega.controller;

import com.xworkz.vega.service.VegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class VegaController {

    @Autowired
    VegaService vegaService;

    public VegaController(){
        System.out.println("this is controller");
    }
    @GetMapping("/vega")
    public String helmet(@RequestParam String name){
        vegaService.displayVega();
        System.out.println("this is helmet method"+name);
        return "index.jsp";
    }

}
