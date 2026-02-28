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
import org.springframework.web.bind.annotation.RequestParam;

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
    public String index(ViDto viDto, Model model) {
        String validation = vi.validation(viDto);
        if (validation.equalsIgnoreCase("register successfully")){
            model.addAttribute("successful",validation);
            return "index";
        } else if (validation.equalsIgnoreCase("not register")) {
            model.addAttribute("errorMsg",validation);
            return "index";

        }else {
            model.addAttribute("errorMsg",validation);
            return "index";
        }


    }
    @GetMapping("readAll")
    public String readAll(Model model){
        List<ViDto> data = vi.getData();
        model.addAttribute("data",data);
        System.out.println("readAll"+data);

        return "readAll";
    }

    @GetMapping("getData")
    public String Update(@RequestParam("id") Integer id, Model model){
        ViDto viDto = vi.GetIdBasedOnService(id);
        if (viDto!=null){
         model.addAttribute("dto",viDto);
            return "Update";

        }

        return "index";
    }
}
