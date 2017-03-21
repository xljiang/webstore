<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="store.model.ProductCatalog, store.model.Product,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Store</title>
</head>
<body>
	<h1>Student Store</h1>
	<p>Items available:</p>

 	<ul>
	<%
	ProductCatalog productCatalog = (ProductCatalog) application.getAttribute("Product Catalog");
	Iterator<String> itr = productCatalog.idSet().iterator();
	while(itr.hasNext()){
		String productid = itr.next();
		String name = productCatalog.getProductById(productid).getName();
	%>
		<li> <a href="show_product.jsp?id=<%= productid %>"><%=name %></a></li>
	<%
	}
	%>
	</ul> 

</body>
</html>