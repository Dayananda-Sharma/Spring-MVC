package com.xworkz.apollo.controller;

import com.xworkz.apollo.dto.ApolloDto;
import com.xworkz.apollo.service.ApolloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SingupController {

    @Autowired
    ApolloService apolloService;

    @GetMapping("singup")
    public String singup(ApolloDto apolloDto){


        try {
            apolloService.validation(apolloDto);
            return "sigupresponse";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "reject";
    }

}
