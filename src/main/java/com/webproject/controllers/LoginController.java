package com.webproject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/signIn")
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Log In");
        mv.addObject("userClickSignIn", true);
        return mv;
    }

    @RequestMapping("/signUp")
    public ModelAndView signUp()
    {
        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Log In");
        mv.addObject("userClickSignUp", true);
        return mv;
    }


}
