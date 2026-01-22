package com.xworkz.ipl.controller;

import com.xworkz.ipl.dto.IplDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
@RequestMapping("/")
public class IplController {

    @PostMapping("/rcb")
    public String rcb(IplDto dto){
        System.out.println("ipl team"+dto.getTeamName()+"Rcb players"+dto.getPlayers()+"RCb caption"+
                dto.getCaption()+"year"+dto.getYear()+"stadium"+dto.getLocation());
        return "response";
    }
    @PreDestroy
    public String destroy(){
        System.out.println("this is destroy method");
        return "";
    }
}
