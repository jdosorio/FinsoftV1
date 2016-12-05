<%-- 
    Document   : Simulaciones
    Created on : 30/11/2016, 05:18:36 PM
    Author     : Juan y Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<section class="content">
    <form id="fmUsuarios" name="fmUsuarios" method="post">
        <div class="row">
            <div class="col-md-12">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Simulaciones</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Cedula: </label>
                                    <input type="text" id="txUsuaCodi" name="txSimuCodi" class="form-control" placeholder="Código de Usuario">
                                </div>
                                <div class="form-group">
                                    <label>Nombre: </label>
                                    <input type="text" id="txUsuaNom1" name="txSimuNom" class="form-control" placeholder="Primer Nombre de Usuario">
                                </div>
                                
                            </div>
                        
                        
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Celular: </label>
                                    <input type="text" id="txUsuaTel1" name="txUsuaTel1" class="form-control" placeholder="Numero Celular del Usuario">
                                </div>
                                <div class="form-group">
                                    <label>Telefono Fijo: </label>
                                    <input type="text" id="txUsuaTel2" name="txUsuaTel2" class="form-control" placeholder="Numero Fijo del Usuario">
                                </div>
                            </div>
                            <div class="col-md-5"></div>
                            <div class="col-md-6">
                                <div class="col-md-3">
                                    <input type="button" value="Consultar" id="btConsultar" name ="btConsultar" class="btn btn-info pull-right"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <div class="box box-default">
                    <div class="col-md-12">
                        <div id="tabla" class="table table-bordered"></div>
                    </div>
                </div>
            </div>
        </div>
        
    </form>
    <br>
    <br>    
</section>

<jsp:include page="footer.jsp" />
