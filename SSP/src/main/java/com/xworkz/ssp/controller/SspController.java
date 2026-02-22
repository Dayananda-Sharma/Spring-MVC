package com.xworkz.ssp.controller;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class SspController {

    @Autowired
    SspService sspService;

    public SspController(){
        System.out.println("this is controller clas");
    }

    @GetMapping("ssp")
    public String controller(SspDto sspDto ,Model model){
        System.out.println("Controller"+sspDto);


        boolean register = sspService.validation(sspDto);
        if (register){
            model.addAttribute("successful","Successfully register...!");
        }else {
            model.addAttribute("invalidData","Enter valid data...!");
        }
        return "index";
    }


    @GetMapping("readAll")
    public String readAll(Model model){
        List<SspDto> sspDtos = sspService.allData();
        model.addAttribute("sspDtos",sspDtos);
        System.out.println("readAll"+sspDtos);
        return "controllerResp";
    }
}
