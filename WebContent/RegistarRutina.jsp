<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:useBean id="error" class="java.lang.String" scope="session"></jsp:useBean>
      <jsp:useBean id="exito" class="java.lang.String" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<script language="javascript" src="js/funciones1.js"></script>
<title>..::Registrar Rutina::..</title>
</head>
<body>
	<form method="post" action="ServletRutina">
		<div id="division">
			<center><h1><b>-Registrar Rutina-</b></h1></center>
					<center><label>Ingrese el Tipo de Horario</label></center>
					
		            <center>  <select id="rrutina" name="tipohorario" onchange="javascript:mostrar()"> 
		               		<option value="0">------------------</option>
							<option value="1">Mañana</option>
							<option value="2">Tarde</option>
							<option value="3">Noche</option>
						</select>
					
					
					<center><label>Ingrese el Tipo de Ejercicio</label></center>
					
		          <select id="rrutina" name="tipoejercicio" onchange="javascript:mostrar()"> 
		               		<option value="0">------------------</option>
							<option value="1">Brazos</option>
							<option value="2">Piernas</option>
							<option value="3">Espalda</option>
						</select>
					</center> 
					
		            <br>
		            <label class="lbl1">Ingresar Id del Instructor: </label><input type="text" name="instructor">
		            <label class="lbl">Ingrese Id del Cliente: </label><input type="text" name="cliente">
		      
		<div>
				<center>
	          		<table id="tabla" border=3>
	          			<tr>
	          				<td>
	          					<center><label>Seleccionar</label></center>
	          				</td>
	          				<td>
	          					<center><label>repeticiones</label></center>
	          				</td>
	          				<td>
	          					<center><label>Observaciones</label></center>
	          				</td>        		
	          		</table>
	          		
						     <input type="button" value="Añadir Fila" onclick="añadirfila('tabla');" />
						
						     <input type="button" value="Eliminar Fila" onclick="eliminarfila('tabla');" />
						     
						     <input type="submit" value="Aceptar" />
	          	</center>	
	          	<center><%=error %></center>
	          		<center><%=exito %></center>
	         <center><h4>*Seleccionar solo los items a eliminar </h4></center>
	<center><h4>*No dejar filas en blanco</h4></center>
	   	</div>
	  	</div>
	  	
	</form>
	
</body>
</html>