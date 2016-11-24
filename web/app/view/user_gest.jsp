<%-- 
    Document   : user_gest
    Created on : 22/11/2016, 12:47:08 PM
    Author     : Juan y Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />

<section class="content">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Creacion/Actualizacion de Usuarios</h3>
        </div>
        <div class="box-body">
                <div class="row">
                      <div class="form-group">
                      <label for="exampleInputEmail1">Email address</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                    </div>
                </div>
            <div class="row">
                <div class="form-group">
                      <label for="exampleInputEmail1">Email address</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                    </div>
            </div>
        </div>
        <div class="box-footer">
            <div class="col-md-2"></div>
            <div class="col-md-4">
                <button type="submit" class="btn btn-info pull-right">Crear</button>
            </div>
        </div>
    </div>
</section>

<jsp:include page="footer.jsp" />
    