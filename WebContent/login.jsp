<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log In</title>
</head>
<body>
	<h1>Welcome to Homework 5</h1>
	<p>Please log in.<br></p>
	<form action="LoginServlet" method="post">
		User Name:<input type="text" name="name"><br>
		Password:<input type="text" name="password">
		<input type="submit" value="Login"><br>
	</form>
	<a href="create_new.jsp">Create New Account</a>
</body>
</html>