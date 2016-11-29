<%-- 
    Document   : Usuarios
    Created on : 24-nov-2016, 11:30:32
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
                    var Codigo = $('#txUsuaCodi').val();
                    var Iden = $('#txUsuaIden').val();
                    var Accion = "Consultar";
                    $.post('SUsuarios',
                    {
                        txUsuaCodi : Codigo,
                        txUsuaIden : Iden,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        $('#tabla').html(responseText);
                    });
		});
                $('#btGuardar').click(function(event)
                {
                    var Codigo = $('#txUsuaCodi').val();
                    var Nombre1 = $('#txUsuaNom1').val();
                    var Nombre2 = $('#txUsuaNom2').val();
                    var Apellido1 = $('#txUsuaApe1').val();
                    var Apellido2 = $('#txUsuaApe2').val();
                    var Iden = $('#txUsuaIden').val();
                    var Correo = $('#txUsuaCorr').val();
                    var Tel1 = $('#txUsuaTel1').val();
                    var Tel2 = $('#txUsuaTel2').val();
                    var Nick = $('#txUsuaNick').val();
                    var Pass = $('#txUsuaPass').val();
                    var Perfil = $('#txUsuaPerf').val();
                    var Estado = $('#txUsuaEsta').val();
                    var Accion = "Guardar";
                    $.post('SUsuarios',
                    {
                        txUsuaCodi : Codigo,
                        txUsuaNom1 : Nombre1,
                        txUsuaNom2 : Nombre2,
                        txUsuaApe1 : Apellido1,
                        txUsuaApe2 : Apellido2,
                        txUsuaIden : Iden,
                        txUsuaCorr : Correo,
                        txUsuaTel1 : Tel1,
                        txUsuaTel2 : Tel2,
                        txUsuaNick : Nick,
                        txUsuaPass : Pass,
                        txUsuaPerf : Perfil,
                        txUsuaEsta : Estado,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btEliminar').click(function(event)
                {
                    var Codigo = $('#txUsuaCodi').val();
                    var Accion = "Eliminar";
                    $.post('SUsuarios',
                    {
                        txUsuaCodi : Codigo,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
                $('#btActualizar').click(function(event)
                {
                    var Codigo = $('#txUsuaCodi').val();
                    var Nombre1 = $('#txUsuaNom1').val();
                    var Nombre2 = $('#txUsuaNom2').val();
                    var Apellido1 = $('#txUsuaApe1').val();
                    var Apellido2 = $('#txUsuaApe2').val();
                    var Iden = $('#txUsuaIden').val();
                    var Correo = $('#txUsuaCorr').val();
                    var Tel1 = $('#txUsuaTel1').val();
                    var Tel2 = $('#txUsuaTel2').val();
                    var Nick = $('#txUsuaNick').val();
                    var Pass = $('#txUsuaPass').val();
                    var Perfil = $('#txUsuaPerf').val();
                    var Estado = $('#txUsuaEsta').val();
                    var Accion = "Actualizar";
                    $.post('SUsuarios',
                    {
                        txUsuaCodi : Codigo,
                        txUsuaNom1 : Nombre1,
                        txUsuaNom2 : Nombre2,
                        txUsuaApe1 : Apellido1,
                        txUsuaApe2 : Apellido2,
                        txUsuaIden : Iden,
                        txUsuaCorr : Correo,
                        txUsuaTel1 : Tel1,
                        txUsuaTel2 : Tel2,
                        txUsuaNick : Nick,
                        txUsuaPass : Pass,
                        txUsuaPerf : Perfil,
                        txUsuaEsta : Estado,
                        btSubmit : Accion
			},
                    function(responseText)
                    {
                        //$('#tabla').html(responseText);
                    });
		});
            });
    </script>
    <form id="fmUsuarios" name="fmUsuarios" method="post">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Gestion de Usuarios</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div><!-- /.box-header -->
                <div class="box-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Código: </label>
                                <input type="text" id="txUsuaCodi" name="txUsuaCodi" class="form-control" placeholder="Código de Usuario">
                            </div>
                            
                            <div class="form-group">
                                <label>Primer Nombre: </label>
                                <input type="text" id="txUsuaNom1" name="txUsuaNom1" class="form-control" placeholder="Primer Nombre de Usuario">
                            </div>
                            
                            <div class="form-group">
                                <label>Segundo Nombre: </label>
                                <input type="text" id="txUsuaNom2" name="txUsuaNom2" class="form-control" placeholder="Segundo Nombre de Usuario">
                            </div>
                            <div class="form-group">
                                <label>Primer Apellido: </label>
                                <input type="text" id="txUsuaApe1" name="txUsuaApe1" class="form-control" placeholder="Primer Apellido del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Segundo Apellido: </label>
                                <input type="text" id="txUsuaApe2" name="txUsuaApe2" class="form-control" placeholder="Segundo Apellido del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Identificación: </label>
                                <input type="text" id="txUsuaIden" name="txUsuaIden" class="form-control" placeholder="Identificación del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Correo: </label>
                                <input type="text" id="txUsuaCorr" name="txUsuaCorr" class="form-control" placeholder="Correo del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Celular: </label>
                                <input type="text" id="txUsuaTel1" name="txUsuaTel1" class="form-control" placeholder="Numero Celular del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Telefono Fijo: </label>
                                <input type="text" id="txUsuaTel2" name="txUsuaTel2" class="form-control" placeholder="Numero Fijo del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Login: </label>
                                <input type="text" id="txUsuaNick" name="txUsuaNick" class="form-control" placeholder="Nickname del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Contraseña: </label>
                                <input type="text" id="txUsuaPass" name="txUsuaPass" class="form-control" placeholder="Contraseña de ingreso del Usuario">
                            </div>
                            <div class="form-group">
                                <label>Perfil: </label>
                                <select id="txUsuaPerf" name="txUsuaPerf" class="form-control">
                                    <option value="ROT">ROOT</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Estado: </label>
                                <select id="txUsuaEsta" name="txUsuaEsta" class="form-control">
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