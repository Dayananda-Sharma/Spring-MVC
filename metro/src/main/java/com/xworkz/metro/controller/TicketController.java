package com.xworkz.metro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TicketController {
    public TicketController(){
        System.out.println("this is ticket method");
    }
    @GetMapping("/ticket")
    public String ticket(){
        System.out.println("ticket method");
        return "ticket.jsp";
    }
}
