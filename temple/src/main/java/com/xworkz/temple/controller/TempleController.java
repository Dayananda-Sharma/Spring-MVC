package com.xworkz.temple.controller;

import com.xworkz.temple.dto.TempleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class TempleController {
    @GetMapping("index")
    public String index(@Valid TempleDto templeDto,BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("invalidName","enter valid userName");
            bindingResult.getFieldError("userName");
        }
        if (bindingResult.hasFieldErrors("age")){
            model.addAttribute("enterValidAge","enter valid age");
            bindingResult.getFieldError("age");
        }
        if (bindingResult.hasFieldErrors("number")){
            model.addAttribute("enterValidNumber","enter correct phoneNumber");
            bindingResult.getFieldError("number");
        }
//model.addAttribute("failed","enter user data");
        return "index";
    }
}
