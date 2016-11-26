<%-- 
    Document   : Usuarios
    Created on : 24-nov-2016, 11:30:32
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Usuarios</title>
    </head>
    <body>
        <form action="SUsuarios">
            Código de Usuario: <input type="text" id="txUsuaCodi" name="txUsuaCodi"><br/>
            Primer Nombre: <input type="text" id="txUsuaNom1" name="txUsuaNom1"><br/>
            Segundo Nombre: <input type="text" id="txUsuaNom2" name="txUsuaNom2"><br/>
            Primer Apellido: <input type="text" id="txUsuaApe1" name="txUsuaApe1"><br/>
            Segundo Apellido: <input type="text" id="txUsuaApe2" name="txUsuaApe2"><br/>
            Identificación: <input type="text" id="txUsuaIden" name="txUsuaIden"><br/>
            Correo: <input type="text" id="txUsuaCorr" name="txUsuaCorr"><br/>
            Telefono 1: <input type="text" id="txUsuaTel1" name="txUsuaTel1"><br/>
            Telefono 2: <input type="text" id="txUsuaTel2" name="txUsuaTel2"><br/>
            Login: <input type="text" id="txUsuaNick" name="txUsuaNick"><br/>
            Contraseña: <input type="text" id="txUsuaPass" name="txUsuaPass"><br/>
            Perfil: <input type="text" id="txUsuaPerf" name="txUsuaPerf"><br/>
            Estado: <input type="text" id="txUsuaEsta" name="txUsuaEsta"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
