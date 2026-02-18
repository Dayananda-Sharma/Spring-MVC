package com.xworkz.phonepay.controlller;

import com.xworkz.phonepay.dto.PhonepayDto;
import com.xworkz.phonepay.service.Phonepay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PreDestroy;

@Controller
@RequestMapping("/")
public class PhonepayController {

    @Autowired
    Phonepay phonepay;

    public PhonepayController(){
        System.out.println("this is controller");

    }

    @GetMapping("pay")
    public String pay(PhonepayDto phonepayDto, Model model){
        System.out.println("Controller==="+phonepayDto);
        phonepay.validation(phonepayDto);
        model.addAttribute("success","Register");
        return "pay";
    }


}
