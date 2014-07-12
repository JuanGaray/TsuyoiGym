<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:useBean id="error" class="java.lang.String" scope="session"></jsp:useBean>
      <jsp:useBean id="exito" class="java.lang.String" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<script language="javascript" src="js/funciones2.js"></script>
<title>..::Registrar Maquina::..</title>
</head>
<body>
	<form method="post" action="ServletMaquina">
		<div id="division">
			<center><h1><b>-Registrar Maquina-</b></h1></center>
					<center><label>Ingrese el Tipo de Horario</label></center>
					
		            <center>  <select id="rmaquina" name="tipohorario" onchange="javascript:mostrar()"> 
		               		<option value="0">------------------</option>
							<option value="1">Mañana</option>
							<option value="2">Tarde</option>
							<option value="3">Noche</option>
						</select>
					</center> 
		            <br>
		            <label class="lbl1">Ingresar Id del Cliente: </label><input type="text" name="cliente">
		            <label class="lbl">Ingrese ID de la maquina: </label><input type="text" name="idmaquina">
		<div>
				<center>
	          		<table id="tabla" border=3>
	          			<tr>
	          				<td>
	          					<center><label>Seleccionar</label></center>
	          				</td>
	          				<td>
	          					<center><label>Tipo de Maquina</label></center>
	          				</td>
	          				<td>
	          					<center><label>Hora del dia</label></center>
	          				</td>
	          				<td>
	          					<center><label>Tiempo a usar</label></center>
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