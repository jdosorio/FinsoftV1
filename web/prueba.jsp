<%-- 
    Document   : prueba
    Created on : 26-nov-2016, 22:00:33
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX JSP Servelts</title>
<!--<script src="http://code.jquery.com/jquery-latest.js">

</script>-->
<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script>
	$(document).ready(function() {
		$('#submit').click(function(event) {
			var nombreVar = $('#nombre').val();
			var apellidoVar = $('#apellido').val();
			var edadVar = $('#edad').val();
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
			$.post('SPrueba', {
				nombre : nombreVar,
				apellido: apellidoVar,
				edad: edadVar
			}, function(responseText) {
				$('#tabla').html(responseText);
			});
		});
	});
</script>
</head>
<body>
	<h2>Ejemplo de AJAX con JSP y Servelts</h2>
	<form id="form1">
		Nombre:<input type="text" id="nombre" /> <br>
		Apellido: <input type="text" id="apellido" /> <br>
		Edad: <input type="text" id="edad" /> <br>
		<input type="button" id="submit" value="Añadir" /> 
	</form>
	<br>
	<!-- 	En este div metemos el contenido de la tabla con AJAX -->
	<div id="tabla"></div>
</body>
</html>
