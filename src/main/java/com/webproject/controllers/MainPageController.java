package com.webproject.controllers;


import com.webproject.dao.ProductDAO;
import com.webproject.dao.ProductDAOImpl;
import com.webproject.entity.ProductTableEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

    @RequestMapping(value={"/", "/home"} )
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Home");
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value={"/about"} )
    public ModelAndView about(){

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickAbout", true);
        return mv;
    }

    @RequestMapping(value={"/contact"} )
    public ModelAndView contact(){

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Contact");
        mv.addObject("userClickContact", true);
        return mv;
    }


}
