<%-- 
    Document   : Estados
    Created on : 24-nov-2016, 0:20:12
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Estados</title>
    </head>
    <body>
        <form action="SEstados">
            Código de Estado: <input type="text" id="txEstaCodi" name="txEstaCodi"><br/>
            Descripción de Estado: <input type="text" id="txEstaDesc" name="txEstaDesc"><br/>
            Función de Estado: <input type="text" id="txEstaFunc" name="txEstaFunc"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
