<%-- 
    Document   : user
    Created on : 19/11/2016, 09:11:25 PM
    Author     : Juan y Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="header.jsp" />
<section class="content">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Gestion de Usuarios</h3>
        </div>
        <div class="box-body">
            <div class="row">
                <div class="col-sm-4"></div>                         
                <div class="col-sm-4">
                    <label for="name">Digita Nombre:</label>
                    <div class="input-group input-group-sm">
                        <input type="text" class="form-control">
                        <span class="input-group-btn">
                            <button class="btn btn-info btn-flat" type="button">Buscar</button>
                        </span>
                    </div>
                </div> 
            </div><br>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="table-responsive no-padding">
                        <table class="table table-hover">
                            <tr>
                              <th>Nombre</th>
                              <th>Apellido</th>
                              <th>Correo</th>
                              <th>Tipo</th>
                              <th>Estado</th>
                              <th></th>
                            </tr>
                            <tr>
                              <td>Juan David</td>
                              <td>Osorio Arrubla</td>
                              <td>admin@finsoft.co</td>
                              <td>ADMIN</td>
                              <td>ACTIVO</td>
                              <td><input type="checkbox"></td>
                            </tr>
                        </table>
                    </div>
                </div>  
            </div>
        </div>
        <div class="box-footer">
            <div class="col-md-2"></div>
            <div class="col-md-4">
                <button type="submit" class="btn btn-info pull-right">Borrar</button>
            </div>
        </div>
    </div>
</section>
<jsp:include page="footer.jsp" />
    