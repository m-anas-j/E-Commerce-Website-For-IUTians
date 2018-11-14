package com.webproject.controllers;

import com.webproject.dao.ProductDAO;
import com.webproject.dao.ProductDAOImpl;
import com.webproject.entity.ProductTableEntity;
import com.webproject.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MainPageController {

    //@Autowired
    ShoppingCartService shoppingCartService = new ShoppingCartService();

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
        ProductTableEntity newProduct = new ProductTableEntity();
        newProduct.setId(59);
        newProduct.setCategory("test2");
        newProduct.setCondition("used2");
        newProduct.setImageUrl("test2//");
        newProduct.setName("testproduct2");
        productDAO.addProduct(newProduct);*/

        ProductDAO productDAO = new ProductDAOImpl();
        List<ProductTableEntity> productList = new ArrayList<ProductTableEntity>();
        productList = productDAO.getAllProducts();

        System.out.println(productList.get(1).getName());

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Log In");
        mv.addObject("userClickLogin", true);
        return mv;
    }

    @RequestMapping(value={"/listProducts"} )
    public ModelAndView viewProducts(){

        ProductDAO productDAO = new ProductDAOImpl();
        List<ProductTableEntity> productList = new ArrayList<ProductTableEntity>();
        productList = productDAO.getAllProducts();

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "View Products");
        mv.addObject("userClickViewProducts", true);
        mv.addObject("productList",productList);
        return mv;
    }

    @RequestMapping(value = "/addToCart")
    public ModelAndView addToCart(HttpServletRequest request, HttpServletResponse response)
    {
        //long productId = Integer.parseInt(request.getParameter("productId"));
        List<ProductTableEntity> shoppingCart = shoppingCartService.addToCart(request);

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "Confirmation Page");
        mv.addObject("userClickAddToCart", true);
        return mv;
    }

    @RequestMapping(value = "/updateCart")
    public ModelAndView updateCart(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session = request.getSession();
        List<ProductTableEntity> shoppingCart =(List<ProductTableEntity>) session.getAttribute("cart");

        shoppingCartService.updateCart(request);

        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "View Cart");
        mv.addObject("userClickUpdateCart", true);
        mv.addObject("shoppingCart",shoppingCart);
        return mv;
    }

    @RequestMapping(value = "/viewCart")
    public ModelAndView viewCart(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session = request.getSession();
        List<ProductTableEntity> shoppingCart =(List<ProductTableEntity>) session.getAttribute("cart");
        ModelAndView mv = new ModelAndView("main-page");
        mv.addObject("title", "View Cart");
        mv.addObject("userClickViewCart", true);
        mv.addObject("shoppingCart",shoppingCart);
        return mv;
    }


}
