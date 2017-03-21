<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="store.model.Product, store.model.DBConnection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	String productid = request.getParameter("id");
	DBConnection dbc = (DBConnection) application.getAttribute("Database Connection");
	Product product = dbc.getProductById(productid);
%>

<title><%= product.getName() %></title>
</head>
<body>
	<h1><%= product.getName() %></h1>	
	<img src="../store-images/<%= product.getImageFile() %>" alt="<%= product.getImageFile() %>"><br>
	
	<form action="ShoppingCartServlet" method="post">
		$<%=product.getPrice() %>
		<input name="productId" type="hidden" value="<%= productid%>">
		<input type="submit" value="Add to Cart">
	</form>

</body>
</html>