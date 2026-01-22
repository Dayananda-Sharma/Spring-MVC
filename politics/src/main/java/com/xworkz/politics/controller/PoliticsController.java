package com.xworkz.politics.controller;

import com.xworkz.politics.dto.PoliticsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PreDestroy;

@Controller
@RequestMapping("/")
public class PoliticsController {

    @PostMapping("/politics")
    public String politics(PoliticsDto dto){
        System.out.println(" leader name=="+dto.getName()+" city=="+dto.getLocation()+"age== "+dto.getAge()+"phoneNumber "+dto.getPhoneNumber()+"State "+dto.getState());
        return "response";
    }
    @PreDestroy
    public String destroy(){
        System.out.println("this is destroy method");
        return "";
    }
}
