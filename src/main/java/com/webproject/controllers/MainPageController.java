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

        ProductDAO productDAO = new ProductDAOImpl();
        ProductTable newProduct = new ProductTable();
        newProduct.setId(5);
        newProduct.setCategory("test1");
        newProduct.setCondition("used1");
        newProduct.setImageUrl("test1//");
        newProduct.setName("testproduct1");
        productDAO.addProduct(newProduct);

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


}
