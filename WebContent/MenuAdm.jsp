<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="usuario" class="java.lang.String" scope="session"> </jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<title>..::Men� Principal::..</title>
</head>
<body>
	<div id="division">
		<center><h1><b>-Men� Principal-</b></h1></center>
		<br>
		<center><h1><b>Bienvenido <%=usuario %></b></h1></center>
		
			<ul>
			   	<li><a href="Registro.jsp" /><center>Registrar Nuevo Usuario</center></li>
	  			<li><a href="RegistrarDieta.jsp" /><center>Registrar Dieta</center></li>
	  			<li><a href="RegistarRutina.jsp"/><center>Registar Rutina</center></li>
	  			<li><a href="RegistrarMaquina.jsp"/><center>Registrar Maquina</center></li>
	  			<li><a href="Principal.jsp"/><center>Cerrar Sesi�n</center></li>
	  			
			</ul>
  	</div>
</body>
</html>