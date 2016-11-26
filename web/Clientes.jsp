<%-- 
    Document   : Clientes
    Created on : 24-nov-2016, 13:19:26
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Clientes</title>
    </head>
    <body>
        <form action="SClientes">
            Código de Cliente: <input type="text" id="txClieCodi" name="txClieCodi"><br/>
            Primer Nombre: <input type="text" id="txClieNom1" name="txClieNom1"><br/>
            Segundo Nombre: <input type="text" id="txClieNom2" name="txClieNom2"><br/>
            Primer Apellido: <input type="text" id="txClieApe1" name="txClieApe1"><br/>
            Segundo Apellido: <input type="text" id="txClieApe2" name="txClieApe2"><br/>
            Identificación: <input type="text" id="txClieIden" name="txClieIden"><br/>
            Fecha Nacimiento: <input type="text" id="txClieFena" name="txClieFena"><br/>
            Telefono 1: <input type="text" id="txClieTel1" name="txClieTel1"><br/>
            Telefono 2: <input type="text" id="txClieTel2" name="txClieTel2"><br/>
            Correo: <input type="text" id="txClieCorr" name="txClieCorr"><br/>
            Direccion: <input type="text" id="txClieDire" name="txClieDire"><br/>
            Salario: <input type="text" id="txClieSaba" name="txClieSaba"><br/>
            Estado: <input type="text" id="txClieEsta" name="txClieEsta"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>
