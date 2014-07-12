<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:useBean id="error" class="java.lang.String" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>..::TsuyoiGym::..</title>
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
</head>
<body>

	<form action="ServletLogueo" method="post">
		<div id="division">
			<center><b><h1>TsuyoiGym</h1></b></center>
			<center>
<b>
<%=error%>
</b>
</center>
			<img id="img01" src="img/images.jpg" />

			
			<div class="forLog">
			
				<label class="label">Usuario</label>
				<input type="text" name="usuario" required="required">
			<br>
			
				<label>Password</label>
				<input type="password" name="password" required="required">
			<br>
				<input id="boton" type="submit"  value="Iniciar Sesion"/>
					
			</div>

			
		</div>

				
	</form>
</body>
</html>