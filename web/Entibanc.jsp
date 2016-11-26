<%-- 
    Document   : Entibanc
    Created on : 25-nov-2016, 10:44:52
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Entidades Bancarias</title>
    </head>
    <body>
        <form action="SEntibanc">
            Código de Entidad Bancaria: <input type="text" id="txEnbaCodi" name="txEnbaCodi"><br/>
            Descripción de Entidad Bancaria: <input type="text" id="txEnbaDesc" name="txEnbaDesc"><br/>
            Estado de Entidad Bancaria: <input type="text" id="txEnbaEsta" name="txEnbaEsta"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
