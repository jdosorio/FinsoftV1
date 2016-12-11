<%-- 
    Document   : Perfiles
    Created on : 24-nov-2016, 9:24:23
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
                    var Codigo = $('#txPerfCodi').val();
                    var Accion = "Consultar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para poder Consultar.');
                        return;
                    }
                    
                    $.post('SPerfiles',
                    {
                        txPerfCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btGuardar').click(function(event)
                {
                    var Codigo = $('#txPerfCodi').val();
                    var Descripcion = $('#txPerfDesc').val();
                    var Tipo = $('#txPerfTipo').val();
                    var Funcion = $('#txPerfFunc').val();
                    var Estado = $('#txPerfEsta').val();
                    var Accion = "Guardar";
                    
                    if(Codigo.length == 0 || Descripcion.length == 0)
                    {
                        alert('Los campos Código y Descripción son Obligatorios.');
                        return;
                    }
                    
                    $.post('SPerfiles',
                    {
                        txPerfCodi : Codigo,
                        txPerfDesc : Descripcion,
                        txPerfTipo : Tipo,
                        txPerfFunc : Funcion,
                        txPerfEsta : Estado,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txPerfCodi').val();
                    var Accion = "Eliminar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para poder Consultar.');
                        return;
                    }
                    
                    $.post('SPerfiles',
                    {
                        txPerfCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txPerfCodi').val();
                    var Descripcion = $('#txPerfDesc').val();
                    var Tipo = $('#txPerfTipo').val();
                    var Funcion = $('#txPerfFunc').val();
                    var Estado = $('#txPerfEsta').val();
                    var Accion = "Actualizar";
                    
                    if(Codigo.length == 0 || Descripcion.length == 0)
                    {
                        alert('Los campos Código y Descripción son Obligatorios.');
                        return;
                    }
                    
                    $.post('SPerfiles',
                    {
                        txPerfCodi : Codigo,
                        txPerfDesc : Descripcion,
                        txPerfTipo : Tipo,
                        txPerfFunc : Funcion,
                        txPerfEsta : Estado,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmPerfiles" name="fmPerfiles" method="post">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Gestión de Perfiles</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Código: </label>
                                    <input type="text" id="txPerfCodi" name="txPerfCodi" class="form-control" placeholder="Código del Perfil">
                                </div>
                                <div class="form-group">
                                    <label>Descripción: </label>
                                    <input type="text" id="txPerfDesc" name="txPerfDesc" class="form-control" placeholder="Descripción del Perfil">
                                </div>
                                <!--<div class="form-group">
                                    <label>Tipo: </label>
                                    <select id="txPerfTipo" name="txPerfTipo" class="form-control">
                                        <option value="CM">Comercial</option>
                                        <option value="OF">Oficina</option>
                                    </select>
                                </div>-->
                                <div class="form-group">
                                    <label>Función: </label>
                                    <input type="text" id="txPerfFunc" name="txPerfFunc" class="form-control" placeholder="Función del Perfil">
                                </div>
                                <div class="form-group">
                                    <label>Estado: </label>
                                    <select id="txPerfEsta" name="txPerfEsta" class="form-control">
                                        <option value="act">Activo</option>
                                        <option value="ina">Inactivo</option>
                                    </select>
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