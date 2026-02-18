package com.xworkz.prizemoney.controller;

import com.xworkz.prizemoney.dto.PrizeDto;
import com.xworkz.prizemoney.service.Prize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrizeMoney {
    @Autowired
    Prize prize;
    public PrizeMoney(){
        System.out.println("this is controller");
    }
    @GetMapping("money")
    public String money(PrizeDto prizeDto ,Model model){
        System.out.println("this is controller"+prizeDto);
         boolean register =prize.validation(prizeDto);
        if (register){
            model.addAttribute("successful","Successfully register...!");
        }else {
            model.addAttribute("invalidData","Enter valid data...!");
        }
        return "index";
    }
}
