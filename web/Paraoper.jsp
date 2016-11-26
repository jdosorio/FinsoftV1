<%-- 
    Document   : Paraoper
    Created on : 25-nov-2016, 10:24:05
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Parametros Operativos</title>
    </head>
    <body>
        <form action="SParaoper">
            Código de Parametro: <input type="text" id="txPaopCodi" name="txPerfCodi"><br/>
            Descripción de Parametro: <input type="text" id="txPaopDesc" name="txPerfDesc"><br/>
            Valor Parametro: <input type="text" id="txPaopValo" name="txPaopValo"><br/>
            Modulo Parametro: <input type="text" id="txPaopModu" name="txPaopModu"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
