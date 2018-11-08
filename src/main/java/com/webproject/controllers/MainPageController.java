package com.webproject.controllers;


import com.webproject.dao.ProductDAO;
import com.webproject.dao.ProductDAOImpl;
import com.webproject.entity.ProductTable;
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
        System.out.println("Loading main page");
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
        mv.addObject("title", "Contact Us");
        mv.addObject("userClickContact", true);
        return mv;
    }

    @RequestMapping(value={"/login"} )
    public ModelAndView login(){

        /*ProductDAO productDAO = new ProductDAOImpl();
        ProductTable newProduct = new ProductTable();
        newProduct.setId(66);
        newProduct.setCategory("test2");
        newProduct.setCondition("used2");
        newProduct.setImageUrl("test2//");
        newProduct.setName("testproduct2");
        productDAO.addProduct(newProduct);*/

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Log In");
        mv.addObject("userClickLogin", true);
        return mv;
    }

    @RequestMapping(value={"/listProducts"} )
    public ModelAndView viewProducts(){
        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "View Products");
        mv.addObject("userClickViewProducts", true);
        return mv;
    }


}
