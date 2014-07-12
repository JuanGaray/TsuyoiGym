<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/estilo.css" media="screen" />
<title>..::Menú Principal::..</title>
</head>
<body>
	<div id="division">
		<center><h1><b>-Registro Usuario-</b></h1></center>
		<form action="ServletRegistro" method="POST">
			<table border="0" align="center">
				<tr>
	                <td align="center"><b>Tipo Usuario:</b><br/>
	                <input type="text" name="tipousuario" class="cuadro_login" /></td>
	            </tr>
				<tr>
	                <td align="center"><b>Usuario:</b><br/>
	                <input type="text" name="usuario" class="cuadro_login" /></td>
	            </tr>
				<tr>
	                <td align="center"><b>Correo:</b><br/>
	                <input type="text" name="correo" class="cuadro_login" /></td>
	            </tr>
              	<tr>
	                <td align="center"><b>Contrase&ntilde;a:</b><br />
	                  <input type="password" name="password"   class="cuadro_login"/></td>
                </tr>
                <tr>
	                <td align="center"><b>Dni:</b><br/>
	                <input type="text" name="dni" class="cuadro_login" /></td>
	            </tr>
                <tr>
	                <td align="center"><b>Nombres:</b><br/>
	                <input type="text" name="nombres" class="cuadro_login" /></td>
	            </tr>
	            <tr>
	                <td align="center"><b>Apellidos:</b><br/>
	                <input type="text" name="apellidos" class="cuadro_login" /></td>
	            </tr>
	            <tr>
	                <td align="center"><b>Distrito:</b><br/>
	                <input type="text" name="distrito" class="cuadro_login" /></td>
	            </tr>
	            <tr>
	                <td align="center"><b>Direccion:</b><br/>
	                <input type="text" name="direccion" class="cuadro_login" /></td>
	            </tr>
	            <tr>
	                <td align="center"><b>Peso:</b><br/>
	                <input type="text" name="peso" class="cuadro_login" /></td>
	                <td align="center"><b>Altura</b>
	                <input type="text" name ="altura" /></td>
	            </tr>
             	 <tr>
	                <td align="center"><b>Edad:</b><br/>
	                <input type="text" name="edad" class="cuadro_login" /></td>
	            </tr>
              	<tr>
	                <td align="center">
	                   <input type="hidden" name="flag" id="flag"  value="2"/>
	                <input type="submit" value="Registrarse" name="registro"  id="boton" /></td>
                </tr>
                <tr>
	                <td align="center">
	                   <input type="hidden" name="flag" id="flag"  value="2"/>
	                <input type="submit" value="Volver" name="volver"  id="boton" /></td>
                </tr>
            </table>
            </form>
  	</div>
</body>
</html>