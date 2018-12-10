package com.oyekanmiayo.rockito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //This class will be registered as a bean in the Spring container
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }
}
