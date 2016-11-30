<%-- 
    Document   : Modulos
    Created on : 28-nov-2016, 9:38:08
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<section class="content">
    <script>
            $(document).ready(function()
            {
            	$('#btConsultar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Accion = "Consultar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para poder Consultar.');
                        return;
                    }
                    
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
                    
                    if(Codigo.length == 0 || Descripcion.length == 0)
                    {
                        alert('Los campos Código y Descripción son Obligatorios.');
                        return;
                    }
                    
                    var Accion = "Guardar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        txModuDesc : Descripcion,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Accion = "Eliminar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para Poder Eliminar.');
                        return;
                    }
                    
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
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txModuCodi').val();
                    var Descripcion = $('#txModuDesc').val();
                    
                    if(Codigo.length == 0 || Descripcion.length == 0)
                    {
                        alert('Los campos Código y Descripción son Obligatorios.');
                        return;
                    }
                    
                    var Accion = "Actualizar";
                    $.post('SModulos',
                    {
                        txModuCodi : Codigo,
                        txModuDesc : Descripcion,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmModulos" name="fmModulos" method="post">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Gestión de Módulos</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Código: </label>
                                    <input type="text" id="txModuCodi" name="txModuCodi" required="required" class="form-control" placeholder="Código del Modulo">
                                </div>
                                <div class="form-group">
                                    <label>Descripción: </label>
                                    <input type="text" id="txModuDesc" name="txModuDesc" class="form-control" placeholder="Descripción del Modulo">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div id="tabla" class="table table-bordered"></div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <input type="button" value="Consultar" id="btConsultar" name ="btConsultar" class="btn btn-info pull-right"/>
                <input type="button" value="Actualizar" id="btActualizar" name ="btActualizar" class="btn btn-info pull-right"/>
                <input type="button" value="Guardar" id="btGuardar" name ="btGuardar" class="btn btn-info pull-right"/>
                <input type="button" value="Eliminar" id="btEliminar" name ="btEliminar" class="btn btn-info pull-right"/>
            </div>
        </div>
    </form>
    <br>
    <br>    
</section>
<jsp:include page="footer.jsp" />