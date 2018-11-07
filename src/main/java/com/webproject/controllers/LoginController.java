package com.webproject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/")
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        String name = "anas";
        mv.addObject("testobjectstring",name);
        return mv;
    }

    @RequestMapping("/login")
    public String testpage()
    {
        return "test-page";
    }
}
