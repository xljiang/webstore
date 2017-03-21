package store.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import store.model.ShoppingCart;

@WebListener
public class ShoppingCartListener implements HttpSessionListener {


    public void sessionCreated(HttpSessionEvent hse)  { 

    	ShoppingCart shoppingCart = new ShoppingCart();
    	HttpSession session = hse.getSession();
    	session.setAttribute("Shopping Cart", shoppingCart);

    }


    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    }
	
}
