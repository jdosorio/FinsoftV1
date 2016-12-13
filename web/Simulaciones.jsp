<%-- 
    Document   : Simulaciones
    Created on : 30/11/2016, 05:18:36 PM
    Author     : Juan y Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<script>
    $(document).ready(function()
            {
            	$('#btConsultar').click(function(event)
                {
                    var Iden = $('#txClieIden').val();
                    var Nom1 = $('#txClieNom1').val();
                    var Tel1 = $('#txClieTel1').val();
                    var Tel2 = $('#txClieTel2').val();
                    
                    $.post('SSimulaciones',
                    {
                        txClieIden : Iden,
                        txClieNom1 : Nom1,
                        txClieTel1 : Tel1,
                        txClieTel2 : Tel2
                    },
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
            });
</script>
<section class="content">
    <form id="fmSimulaciones" name="fmSimulaciones" method="post">
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
                                    <input type="text" id="txClieIden" name="txClieIden" class="form-control" placeholder="Identificación de Cliente">
                                </div>
                                <div class="form-group">
                                    <label>Nombre: </label>
                                    <input type="text" id="txClieNom1" name="txClieNom1" class="form-control" placeholder="Primer Nombre de Cliente">
                                </div>
                                
                            </div>
                        
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Celular: </label>
                                    <input type="text" id="txClieTel1" name="txClieTel1" class="form-control" placeholder="Numero Celular del Cliente">
                                </div>
                                <div class="form-group">
                                    <label>Telefono Fijo: </label>
                                    <input type="text" id="txClieTel2" name="txClieTel2" class="form-control" placeholder="Numero Fijo del Cliente">
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
                <!--<div class="box box-default">-->
                    <div class="col-md-12">
                        <div id="tabla" class="table table-responsive"></div>
                    </div>
                <!--</div>-->
            </div>
        </div>
    </form>
    <br>
    <br>    
</section>
<jsp:include page="footer.jsp" />