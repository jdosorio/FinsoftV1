<%-- 
    Document   : Modulos
    Created on : 24-nov-2016, 0:21:39
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Modulos</title>
    </head>
    <body>
        <form action="SModulos">
            Código de Modulo: <input type="text" id="txModuCodi" name="txModuCodi"><br/>
            Descripción de Modulo: <input type="text" id="txModuDesc" name="txModuDesc"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
