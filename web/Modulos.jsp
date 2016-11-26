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
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>Gestion Modulos</title>
    </head>
    <body>
        <form class="form-horizontal" style="margin:0 auto" method="post" action="SModulos">
            <div class="form-group">
                <label class="col-lg-4 control-label">Código de Modulo: </label>
                <div class="col-lg-4">
                    <input type="text" id="txModuCodi" name="txModuCodi">
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4 control-label">Descripción de Modulo: </label>
                <div class="col-lg-4">
                    <input type="text" id="txModuDesc" name="txModuDesc">
                </div>
            </div>
            <div class="form-group">
                <div class="">
                    <button type="submit" class="btn btn-success left">Registrarse</button>
                </div>
            </div>
            
            <input type="submit" value="Consultar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Actualizar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Guardar" id="btSubmit" name ="btSubmit"/>
            <input type="submit" value="Eliminar" id="btSubmit" name ="btSubmit"/>
        </form>
        <button type="button" class="btn btn-success">Éxito</button>
        <script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
    </body>
</html>
