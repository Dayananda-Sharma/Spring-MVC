package com.xworkz.youtube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TubeController {

    @GetMapping("/you")
    public String you(@RequestParam String name){
        System.out.println("this is controller cls=="+name);
        return "you";
    }
    @GetMapping("/number")
    public String number(@RequestParam String num){
        System.out.println("this is controller cls=="+num);
        return "respnum";
    }
    @GetMapping("/title")
    public String title(@RequestParam String title){
        System.out.println("this is controller cls=="+title);
        return "title";
    }
    @GetMapping("/video")
    public String video(@RequestParam String video){
        System.out.println("this is controller cls=="+video);
        return "video";
    }
    @GetMapping("/comment")
    public String comment(@RequestParam String comment){
        System.out.println("this is controller cls=="+comment);
        return "comment";
    }
    @GetMapping("/media")
    public String media(@RequestParam String media){
        System.out.println("this is controller cls=="+media);
        return "media";
    }
    @GetMapping("/post")
    public String post(@RequestParam String post){
        System.out.println("this is controller cls=="+post);
        return "post";
    }
    @GetMapping("/url")
    public String url(@RequestParam String url){
        System.out.println("this is controller cls=="+url);
        return "url";
    }
    @GetMapping("/income")
    public String income(@RequestParam String income){
        System.out.println("this is controller cls=="+income);
        return "income";
    }
    @GetMapping("/subscribe")
    public String subscribe(@RequestParam String subscribe){
        System.out.println("this is controller cls=="+subscribe);
        return "subscribe";
    }
}
