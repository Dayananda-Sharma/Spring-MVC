package com.xworkz.phonepay.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PreDestroy;

@Controller
@RequestMapping("/")
public class PhonepayController {
    public PhonepayController(){
        System.out.println("this is controller");
    }

    @GetMapping("pay")
    public String pay(){
        return "pay";
    }
    @PreDestroy
    public String destroy(){
        return "";
    }

}
