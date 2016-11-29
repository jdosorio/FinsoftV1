<%-- 
    Document   : Compcacl
    Created on : 25-nov-2016, 11:31:05
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
                    var Codigo = $('#txCoccCodi').val();
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
                    var Codigo = $('#txCoccCodi').val();
                    var EntiBanc = $('#txCoccEnba').val();
                    var CoccVacr = $('#txCoccVacr').val();
                    var CoccVafu = $('#txCoccVafu').val();
                    var CoccVapr = $('#txCoccVapr').val();
                    var CoccOpco = $('#txCoccOpco').val();
                    var Accion = "Guardar";
                    $.post('SParaoper',
                    {
                        txCoccCodi : Codigo,
                        txCoccEnba : EntiBanc,
                        txCoccVacr : CoccVacr,
                        txCoccVafu : CoccVafu,
                        txCoccVapr : CoccVapr,
                        txCoccOpco : CoccOpco,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txCoccCodi').val();
                    var Accion = "Eliminar";
                    $.post('SParaoper',
                    {
                        txCoccCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txCoccCodi').val();
                    var EntiBanc = $('#txCoccEnba').val();
                    var CoccVacr = $('#txCoccVacr').val();
                    var CoccVafu = $('#txCoccVafu').val();
                    var CoccVapr = $('#txCoccVapr').val();
                    var CoccOpco = $('#txCoccOpco').val();
                    var Accion = "Actualizar";
                    $.post('SParaoper',
                    {
                        txCoccCodi : Codigo,
                        txCoccEnba : EntiBanc,
                        txCoccVacr : CoccVacr,
                        txCoccVafu : CoccVafu,
                        txCoccVapr : CoccVapr,
                        txCoccOpco : CoccOpco,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmCompcacl" name="fmCompcacl" method="post">
    <div class="row">
        <div class="col-md-6">
            <div class="box box-default">
                <div class="box-header with-border">
                    <h3 class="box-title">Gestion de Compra de Cartera</h3>
                    <div class="box-tools pull-right">
                      <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                    </div>
                </div>
                <div class="box-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Código: </label>
                                <input type="text" id="txCoccCodi" name="txCoccCodi" class="form-control" placeholder="Código de Compra">
                            </div>
                            <div class="form-group">
                                <label>Entidad Bancaria: </label>
                                <input type="text" id="txCoccEnba" name="txCoccEnba" class="form-control" placeholder="Código de Entidad Bancaria">
                            </div>
                            <div class="form-group">
                                <label>Valor del Credito: </label>
                                <input type="text" id="txCoccVacr" name="txCoccVacr" class="form-control" placeholder="Valor del Credito">
                            </div>
                            <div class="form-group">
                                <label>Valor Futuro: </label>
                                <input type="text" id="txCoccVafu" name="txCoccVafu" class="form-control" placeholder="Valor Vigencia Futura">
                            </div>
                            <div class="form-group">
                                <label>Valor Presente: </label>
                                <input type="text" id="txCoccVapr" name="txCoccVapr" class="form-control" placeholder="Valor Presente">
                            </div>
                            <div class="form-group">
                                <label>Opcion de Compra: </label>
                                <select id="txCoccOpco" name="txCoccOpco">
                                    <option values="S">Si</option>
                                    <option values="N">No</option>
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