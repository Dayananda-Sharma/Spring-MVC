package com.xworkz.train.controller;

import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")

public class TrainController {
    @Autowired
    TrainService trainService;
    public TrainController(){
        System.out.println("this is controller class");
    }

    @PostMapping("index")
    public String index(TrainDto trainDto, Model model){

        String validation = trainService.validation(trainDto);
        System.out.println("controller"+trainDto);

        if (validation.equalsIgnoreCase("register successfully")){
            model.addAttribute("successful",validation);
            return "index";

        } else if (validation.equalsIgnoreCase("User Data failed to save")) {
            model.addAttribute("errMsg",validation);
            return "index";

        }else if (validation.equalsIgnoreCase("User Data already exist in DataBase")){
            model.addAttribute("errMsg",validation);
            return "index";
        }else {
            model.addAttribute("errMsg",validation);
            return "index";
        }

    }
    @GetMapping("readAll")
    public String readAll(Model model){
        List<TrainDto> allData = trainService.getAllData();
        model.addAttribute("allData",allData);
        System.out.println("readAll"+allData);
        return "readAll";
    }

    @GetMapping("getData")
    public String update(@RequestParam int id,Model model){
        TrainDto trainDto = trainService.idValidationOnService(id);
        if (trainDto!=null){
            model.addAttribute("dto",trainDto);
            return "update";
        }

        return "index";
    }


}
