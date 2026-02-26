package com.xworkz.vi.controller;

import com.xworkz.vi.dto.ViDto;
import com.xworkz.vi.service.VI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ViController {

    @Autowired
    VI vi;
    public ViController(){
        System.out.println("this is controller class");
    }
    @PostMapping("index")
    public String index(ViDto viDto, Model model){
        boolean validation = vi.validation(viDto);
        if (validation){
            model.addAttribute("successful","Register successful!!!...");
        }else {
            model.addAttribute("invalidData","Enter Valid Data ");
        }
        return "index";
    }
    @GetMapping("readAll")
    public String readAll(Model model){
        List<ViDto> data = vi.getData();
        model.addAttribute("data",data);
        System.out.println("readAll"+data);

        return "readAll";
    }
}
