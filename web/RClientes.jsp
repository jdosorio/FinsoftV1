<%-- 
    Document   : RClientes
    Created on : 08-dic-2016, 12:26:39
    Author     : FELIPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<section class="content">
    <script>
            $(document).ready(function()
            {
            	$('#btGenerar').click(function(event)
                {
                    var Estado = $('#txClieEsta').val();
                    var Salario1 = $('#txClieSaba1').val();
                    var Salario2 = $('#txClieSaba2').val();
                    
                    $.post('SRClientes',
                    {
                        txClieEsta : Estado,
                        txClieSaba1 : Salario1,
                        txClieSaba2 : Salario2
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmRClientes" name="fmRClientes" method="post">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Reporte de Clientes</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Estado de Usuarios: </label>
                                    <input type="text" id="txClieEsta" name="txClieEsta" required="required" class="form-control" placeholder="Filtro Estado">
                                </div>
                                <div class="form-group">
                                    <label>Salario: </label>
                                    <input type="text" id="txClieSaba1" name="txClieSaba1" class="form-control" placeholder="Filtro Salario">
                                    a
                                    <input type="text" id="txClieSaba2" name="txClieSaba2" class="form-control" placeholder="Filtro Salario">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div id="tabla"></div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <input type="button" value="Generar Reporte" id="btGenerar" name ="btGenerar" class="btn btn-info pull-right"/>
            </div>
        </div>
    </form>
    <br>
    <br>
</section>
<jsp:include page="footer.jsp" />