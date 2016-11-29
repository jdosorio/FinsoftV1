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
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txPaopCodi').val();
                    var Accion = "Eliminar";
                    $.post('SParaoper',
                    {
                        txPaopCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txPaopCodi').val();
                    var Descripcion = $('#txPaopDesc').val();
                    var Valor = $('#txPaopValo').val();
                    var Modulo = $('#txPaopModu').val();
                    var Accion = "Actualizar";
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
                        //$('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmParaoper" name="fmParaoper" method="post">
    <div class="row">
        <div class="col-md-6">
            <div class="box box-default">
                <div class="box-header with-border">
                    <h3 class="box-title">Gestion de Parametro Operativos</h3>
                    <div class="box-tools pull-right">
                      <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                    </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Código: </label>
                                <input type="text" id="txPaopCodi" name="txPaopCodi" class="form-control" placeholder="Código del Parametro Operativo">
                            </div>
                            
                            <div class="form-group">
                                <label>Descripción: </label>
                                <input type="text" id="txPaopDesc" name="txPaopDesc" class="form-control" placeholder="Descripción del Parametro Operativo">
                            </div>
                            
                            <div class="form-group">
                                <label>Valor: </label>
                                <input type="text" id="txPaopValo" name="txPaopValo" class="form-control" placeholder="Valor del Parametro Operativo">
                            </div>
                            <div class="form-group">
                                <label>Modulo: </label>
                                <input type="text" id="txPaopModu" name="txPaopModu" class="form-control" placeholder="Modulo del Parametro">
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