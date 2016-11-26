<%-- 
    Document   : Perfiles
    Created on : 24-nov-2016, 9:24:23
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Perfiles</title>
    </head>
    <body>
        <form action="SPerfiles">
            Código de Perfil: <input type="text" id="txPerfCodi" name="txPerfCodi"><br/>
            Descripción de Perfil: <input type="text" id="txPerfDesc" name="txPerfDesc"><br/>
            Tipo de Perfil: <input type="text" id="txPerfTipo" name="txPerfTipo"><br/>
            Función de Perfil: <input type="text" id="txPerfFunc" name="txPerfFunc"><br/>
            Estado de Perfil: <input type="text" id="txPerfEsta" name="txPerfEsta"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
