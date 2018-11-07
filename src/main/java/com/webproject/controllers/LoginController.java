package com.webproject.controllers;


import com.webproject.dao.ProductDAO;
import com.webproject.dao.ProductDAOImpl;
import com.webproject.entity.ProductTableEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        String name = "anas";
        mv.addObject("testobjectstring",name);
        return mv;
    }

    @RequestMapping("/")
    public String testpage()
    {
        ProductDAO yay = new ProductDAOImpl();
        ProductTableEntity yay1 = new ProductTableEntity();
        yay.addProduct(yay1);
        return "main-page";
    }
}
