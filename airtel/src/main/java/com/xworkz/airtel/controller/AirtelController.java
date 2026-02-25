package com.xworkz.airtel.controller;

import com.xworkz.airtel.dto.AirtelDto;
import com.xworkz.airtel.service.Airtel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class AirtelController {
    @Autowired
    Airtel airtel;
    public AirtelController(){
        System.out.println("this controller class");
    }

    @PostMapping("air")
    public String index(AirtelDto airtelDto , Model model){
        System.out.println("controller=="+airtelDto);
        boolean validation = airtel.validation(airtelDto);
        if (validation) {
            model.addAttribute("successful", "Register successful!!!...");
        }else {
            model.addAttribute("invalidData", "Enter vaild data...");
        }

        return "index";
    }

    @GetMapping("readAll")
    public String readAll(Model model){
        List<AirtelDto> dtos = airtel.AllData();
        System.out.println("readAll"+dtos);
        model.addAttribute("dtos",dtos);
        return "readAll";
    }
}
