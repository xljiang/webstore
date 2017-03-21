package store.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import store.model.ShoppingCart;

@WebServlet("/store/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String productid = request.getParameter("productId");
	 	HttpSession session = request.getSession();
	 	ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("Shopping Cart");
	 	
	 	if(productid != null){
	 		
	 		shoppingCart.addProduct(productid);
	 	
	 	} else{
	 		ShoppingCart newCart = new ShoppingCart();
	 		
	 		Enumeration<String> ids = request.getParameterNames();
	 		while(ids.hasMoreElements()){
	 			productid = ids.nextElement();
	 			int quantity = Integer.parseInt(request.getParameter(productid));
	 			if (quantity != 0){
	 				newCart.addProduct(productid, quantity);
	 			}
	 		}
	 	
	 		shoppingCart = newCart;
	 	}	 	

	 	session.setAttribute("Shopping Cart", shoppingCart);
	 	request.getRequestDispatcher("shopping_cart.jsp").forward(request,response); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
