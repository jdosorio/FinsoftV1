<%-- 
    Document   : Compcacl
    Created on : 25-nov-2016, 11:31:05
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Compra de Cartera al Cliente</title>
    </head>
    <body>
        <form action="SCompcacl">
            Código: <input type="text" id="txCoccCodi" name="txCoccCodi"><br/>
            Entidad Bancaria: <input type="text" id="txCoccEnba" name="txCoccEnba"><br/>
            Valor del Credito: <input type="text" id="txCoccVacr" name="txCoccVacr"><br/>
            Valor Futuro: <input type="text" id="txCoccVafu" name="txCoccVafu"><br/>
            Valor Presente: <input type="text" id="txCoccVapr" name="txCoccVapr"><br/>
            Opcion de Compra: <input type="text" id="txCoccOpco" name="txCoccOpco"><br/>
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
    </body>
</html>