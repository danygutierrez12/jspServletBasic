<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>
			Test JSP login
		</title>
	</head>

	<%
		System.out.println(request.getParameter("nombre"));
	%>

	<body>
		<h2>Hola ${nombre}</h2>
	
	<form action="/login.do" method="post">
	
		<p><font color="red">${error}</font></p>
		<div>
			Usuario
			<input type="text" name="nombre"/>
		</div>
		<div>
			<input type="submit" value="Login">
		</div>
	</form>
	
	</body>
</html>

