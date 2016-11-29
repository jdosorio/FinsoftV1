<%-- 
    Document   : Modulos
    Created on : 24-nov-2016, 0:21:39
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="app/view/header.jsp" />
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/color.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>FinSoft S.A.S</title>-->
        <!--<script>
            $(document).ready(function()
            {
            	$('#btConsultar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Accion = "Consultar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btGuardar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Descripcion = $('#txModuDesc').val();
                    var Accion = "Guardar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        txModuDesc : Descripcion,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Accion = "Eliminar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Accion = "Actualizar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
            });
</script>-->
        
    <!--</head>
    <body>-->
    <section class="content">
        <form id="fmModulos" name="fmModulos" class="form-horizontal" style="margin:0 auto" method="post">
            <div class="form-group">
                <label class="col-lg-4 control-label">Código de Modulo: </label>
                <div class="col-lg-4">
                    <input type="text" id="txModuCodi" name="txModuCodi" required="required">
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4 control-label">Descripción de Modulo: </label>
                <div class="col-lg-4">
                    <input type="text" id="txModuDesc" name="txModuDesc">
                </div>
            </div>
            
            <input type="button" value="Consultar" id="btConsultar" name ="btConsultar"/>
            <input type="button" value="Actualizar" id="btActualizar" name ="btActualizar"/>
            <input type="button" value="Guardar" id="btGuardar" name ="btGuardar"/>
            <input type="button" value="Eliminar" id="btEliminar" name ="btEliminar"/>
        </form>
        <p class="text-muted">Clase text-muted</p>
<p class="text-primary">Clase text-primary</p>
<p class="text-success">Clase text-success</p>
<p class="text-info">Clase text-info</p>
<p class="text-warning">Clase text-warning</p>
<p class="text-danger">Clase text-danger</p>
        <div id="tabla"></div>
        
        
        <div class="container">
            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
        		<div class="panel-heading">
                            <h3 class="panel-title">Gestion de Modulos</h3>
                        </div>
			<div class="panel-body">
			    <form role="form">
			    	<div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" id="txModuCodi" name="txModuCodi" required="required" class="form-control input-sm" placeholder="Código del Modulo">
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" id="txModuDesc" name="txModuDesc" class="form-control input-sm" placeholder="Last Name">
			    		</div>
                                    </div>
			    	</div>
			    	<div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
			    	</div>
			    	<div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
			    		</div>
                                    </div>
			    	</div>		
			    	<input type="submit" value="Register" class="btn btn-info btn-block">	
			    </form>
			</div>
                    </div>
    		</div>
            </div>
        </div>
    <!--</body>
</html>-->
    </section>
    <jsp:include page="app/view/footer.jsp" />
