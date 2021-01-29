package com.gifmis.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping()
    public String welcome(){
        return "home";

    }

    @GetMapping("about-us")
    public String aboutUs(){
        return "about_us";
   }
}
