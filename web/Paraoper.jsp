<%-- 
    Document   : Paraoper
    Created on : 25-nov-2016, 10:24:05
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
                    var Codigo = $('#txPaopCodi').val();
                    var Accion = "Consultar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para poder Consultar.');
                        return;
                    }
                    
                    $.post('SParaoper',
                    {
                        txPaopCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btGuardar').click(function(event)
                {
                    var Codigo = $('#txPaopCodi').val();
                    var Descripcion = $('#txPaopDesc').val();
                    var Valor = $('#txPaopValo').val();
                    var Modulo = $('#txPaopModu').val();
                    var Accion = "Guardar";
                    
                    if(Codigo.length == 0 || Descripcion.length == 0 ||
                       Valor.length == 0 || Modulo.length == 0)
                    {
                        alert('Todos los Campos son Obligatorios.');
                        return;
                    }
                    
                    $.post('SParaoper',
                    {
                        txPaopCodi : Codigo,
                        txPaopDesc : Descripcion,
                        txPaopValo : Valor,
                        txPaopModu : Modulo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txPaopCodi').val();
                    var Accion = "Eliminar";
                    
                    if(Codigo.length == 0)
                    {
                        alert('Digite un Código para poder Eliminar.');
                        return;
                    }
                    
                    $.post('SParaoper',
                    {
                        txPaopCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txPaopCodi').val();
                    var Descripcion = $('#txPaopDesc').val();
                    var Valor = $('#txPaopValo').val();
                    var Modulo = $('#txPaopModu').val();
                    var Accion = "Actualizar";
                    
                    if(Codigo.length == 0 || Descripcion.length == 0 ||
                       Valor.length == 0 || Modulo.length == 0)
                    {
                        alert('Todos los Campos son Obligatorios.');
                        return;
                    }
                    
                    $.post('SParaoper',
                    {
                        txPaopCodi : Codigo,
                        txPaopDesc : Descripcion,
                        txPaopValo : Valor,
                        txPaopModu : Modulo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmParaoper" name="fmParaoper" method="post">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Gestión de Parámetros Operativos</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Código: </label>
                                    <input type="text" id="txPaopCodi" name="txPaopCodi" class="form-control" placeholder="Código del Parámetro Operativo">
                                </div>
                                <div class="form-group">
                                    <label>Descripción: </label>
                                    <input type="text" id="txPaopDesc" name="txPaopDesc" class="form-control" placeholder="Descripción del Parámetro Operativo">
                                </div>
                                <div class="form-group">
                                    <label>Valor: </label>
                                    <input type="text" id="txPaopValo" name="txPaopValo" class="form-control" placeholder="Valor del Parámetro Operativo">
                                </div>
                                <div class="form-group">
                                        <label>Módulo: </label>
                                    <input type="text" id="txPaopModu" name="txPaopModu" class="form-control" placeholder="Módulo del Parámetro">
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