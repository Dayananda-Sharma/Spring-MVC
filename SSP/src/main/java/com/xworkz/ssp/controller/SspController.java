package com.xworkz.ssp.controller;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SspController {
    @Autowired
    SspService sspService;
    public SspController(){
        System.out.println("this is controller clas");
    }
    @GetMapping("money")
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
}
