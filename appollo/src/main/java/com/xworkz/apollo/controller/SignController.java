package com.xworkz.apollo.controller;

import com.xworkz.apollo.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SignController {

    @Autowired
    SignService signService;

    @GetMapping("/signIn")   // fixed spelling also
    public String signIn(@RequestParam String name,
                         @RequestParam Integer number) {

        boolean isValidation = signService.detailsRetrive(name,number);

        if (isValidation) {
            return "signInsuccessful";
        } else {
            return "signfailed";
        }
    }
}
