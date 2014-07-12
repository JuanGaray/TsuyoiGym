<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="tsuyoigym.JDBC.Cliente" %>
 <jsp:useBean id="listac" class="java.util.ArrayList" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Perfil</title>
</head>
<body>
	<div id="division">
	<center><b><h1>-Perfil de Usuario-</h1></b></center>
	<div class="perfil">
		<% if ( listac != null ) { %>
		<table border="5" align="left">
		
	<%	for (int i=0; i < listac.size(); i++ ) {
			Cliente c = (Cliente)listac.get(i);
			
	%>
			
			
			
			<tr>
				<td>Nombre:</td>
				<td><%= c.getNombres() %></td>
			</tr>
			<tr>
				<td>Apellidos:</td>
				<td><%= c.getApellidos() %></td>
			</tr>
			<tr>
				<td>Distrito:</td>	
				<td><%= c.getDistrito() %></td>
			</tr>
			<tr>
				<td>Direccion:</td>
				<td><%= c.getDireccion() %></td>
			</tr>
			<tr>
				<td>Peso:</td>
				<td><%= c.getPeso() %></td>
			<tr>
				<td>Altura:</td>
				<td><%= c.getAltura() %></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><%= c.getEdad() %></td>
			</tr>
			
	<%}} %>
	</table>	
	</div>
	</div>

</body>
</html>