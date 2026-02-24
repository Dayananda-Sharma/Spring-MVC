package com.xworkz.nsp.controller;

import com.xworkz.nsp.dto.NspDto;
import com.xworkz.nsp.repo.NspRepo;
import com.xworkz.nsp.service.Nsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")

public class NspController {

    @Autowired
    Nsp nsp;
    public NspController(){
        System.out.println("this is Controller class");
    }
    @GetMapping("nsp")
    public String controllerMethod(NspDto nspDto, Model model){
        System.out.println("Controller=="+nspDto);
        boolean register = nsp.validation(nspDto);
        if (register){
            model.addAttribute("successful","register successful!!!");
        }else {
            model.addAttribute("invalidData","Enter valid Data");
        }
        return "index";

    }
    @GetMapping("readAll")
    public String readAll(Model model){
        List<NspDto> nspDtos = nsp.getAllData();
        model.addAttribute("nspDtos",nspDtos);

        System.out.println("readAll"+nspDtos);

        return "resp";
    }
}
