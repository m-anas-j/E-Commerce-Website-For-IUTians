package com.webproject.services;


import com.webproject.dao.ProductDAO;
import com.webproject.dao.ProductDAOImpl;
import com.webproject.entity.ProductTableEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {

    private List<ProductTableEntity> shoppingCartList;

    public List<ProductTableEntity> addToCart(HttpServletRequest request)
    {
        shoppingCartList = null;
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(60);
        Object objectCart = session.getAttribute("cart");
        shoppingCartList = (List<ProductTableEntity>) objectCart;

        if (shoppingCartList==null)
        {
            shoppingCartList = new ArrayList<ProductTableEntity>();
            session.setAttribute("cart",shoppingCartList);
        }


        ProductDAO productDAO = new ProductDAOImpl();

        long productId = Long.parseLong(request.getParameter("productId"));
        ProductTableEntity addedProduct = productDAO.getSingleProduct(productId);

        boolean alreadyAdded = checkIfAlreadyAdded(addedProduct);

        if (alreadyAdded)
        {
            for (int i =0;i<shoppingCartList.size();i++)
            {
                if (shoppingCartList.get(i).getId()==addedProduct.getId())
                {
                    shoppingCartList.get(i).setQuantity(shoppingCartList.get(i).getQuantity()+1);
                }
            }
        }
        else if (!alreadyAdded)
        {
            addedProduct.setQuantity(1);
            shoppingCartList.add(addedProduct);
        }

        session.setAttribute("cart",shoppingCartList);

        return shoppingCartList;
    }

    public void updateCart(HttpServletRequest request)
    {
        long productId = Long.parseLong(request.getParameter("productId"));
        for (int i = 0;i<shoppingCartList.size();i++)
        {
            if (shoppingCartList.get(i).getId()==productId)
            {
                Integer newQuantity = Integer.parseInt(request.getParameter("productQuantity"));
                shoppingCartList.get(i).setQuantity(newQuantity);
            }
        }
    }

    private boolean checkIfAlreadyAdded(ProductTableEntity addedProduct)
    {
        boolean alreadyAdded = false;
        long id = addedProduct.getId();
        for (int i = 0;i<shoppingCartList.size();i++)
        {
            if (shoppingCartList.get(i).getId()==id)
            {
                alreadyAdded = true;
            }
        }
        return alreadyAdded;
    }
}
