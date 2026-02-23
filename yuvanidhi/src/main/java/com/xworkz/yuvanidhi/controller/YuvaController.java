package com.xworkz.yuvanidhi.controller;

import com.xworkz.yuvanidhi.dto.YuvaDto;
import com.xworkz.yuvanidhi.service.Yuva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")

public class YuvaController {

    @Autowired
    Yuva yuva;
    public YuvaController(){
        System.out.println("this is controller class");
    }
    @GetMapping("yuva")
    public String ControllerMethod(YuvaDto yuvaDto, Model model){
        System.out.println("controller=="+yuvaDto);
        boolean register= yuva.validation(yuvaDto);
        if (register){
            model.addAttribute("successful","Register successful !!!");
        }else {
            model.addAttribute("invalidData","Enter valid Data");

        }

        return "index";
    }
    @GetMapping("readAll")
    public String readAll(Model model){
        List<YuvaDto> yuvaDtos = yuva.getData();
        model.addAttribute("yuvaDtos",yuvaDtos);
        System.out.println("readAll"+yuvaDtos);

        return "readAll";
    }
}
