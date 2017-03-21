<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.math.BigDecimal, store.model.Product, store.model.ShoppingCart,store.model.DBConnection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Shopping Cart</title>
</head>
<body>

	<h1>Shopping Cart</h1>
	
	<form action="ShoppingCartServlet">
	<ul>
		<%
		 	ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("Shopping Cart");
			for(String productid : shoppingCart.keySet()){
				DBConnection dbc = (DBConnection) application.getAttribute("Database Connection");
				Product product = dbc.getProductById(productid);
				String name = product.getName();
				BigDecimal price = product.getPrice();
				int quantity = shoppingCart.getQuantity(productid);
		%>
			<li>
				<input name="<%= productid %>" type="number" value="<%= quantity %>" min="0"><%= name %>, <%= price %>
			</li>			
		<%
			}
		%>
	</ul>
	Total:$<%=shoppingCart.getTotalPrice() %>
	<input type="submit" value="Update Cart">
	</form>
	
	<a href="homepage.jsp">Continue Shopping</a>
</body>
</html>