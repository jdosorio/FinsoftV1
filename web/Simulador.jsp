<%-- 
    Document   : Simulador
    Created on : 27/11/2016, 07:41:19 AM
    Author     : Juan y Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<script src="app/simulador.js"></script>
<script>
    function sendForm()
{
	$.ajax({
                    url: "SSimulado",
                    type: "POST",
                    dataType: 'json',
                    timeout: 30000,
                    data: { data_frm: $(document.forms.fmSimulado).serializeArray()},
                    cache: false,
                    success: function (data) {
						//console.log(data);
						console.log(data);
					},
                    error: function (data) { console.log(data); }
    });
}
    
</script>
<form id="fmSimulado" name="fmSimulado" method="post">
    <section class="content">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Datos Generales</h3>
                        <div class="box-tools pull-right">
                          <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div><!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Primer Apellido</label>
                                    <input class="form-control" name="txtSimuApe1" id="txtSimuApe1" type="text" placeholder="ejemplo">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Primer Nombre</label>
                                    <input class="form-control" type="text" name="txSimuNom1" id="txSimuNom1" placeholder="ejemplo">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Cedula</label>
                                    <input class="form-control" type="text" name="txSimuCedu" id="txSimuCedu"placeholder="ejemplo">
                                </div><!-- /.form-group --> 

                                <div class="form-group">
                                    <label>US phone mask:</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-phone"></i>
                                        </div>
                                        <input type="text" class="form-control" name="txSimuTele" id="txSimuTele">
                                    </div><!-- /.input group -->
                                </div><!-- /.form group --><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Direccion</label>
                                    <input class="form-control" name="txSimuDire" id="txSimuDire" type="text" placeholder="ejemplo">
                                </div><!-- /.form-group -->
                            </div><!-- /.col -->

                            <div class="col-md-6">
                                <div class="form-group">
                                  <label>Segundo Apellido</label>
                                  <input class="form-control" type="text" name="txSimuApe2" id="txSimuApe2" placeholder="ejemplo">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                  <label>Segundo Nombre</label>
                                  <input class="form-control" type="text" name="txSimuNom2" id="txSimuNom2" placeholder="ejemplo">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                  <label>Fecha Nacimiento</label>
                                  <input class="form-control" type="text" name="txtSimuNaci" id="txtSimuNaci" placeholder="ejemplo">
                                </div>

                                <div class="form-group">
                                    <label>eMail</label>
                                    <div class="input-group">
                                        <span class="input-group-addon">@</span>
                                        <input type="text" class="form-control" name="txtSimuMail" id="txtSimuMail" placeholder="Username">
                                    </div>
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Salario Basico</label>
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                                        <input type="text" class="form-control" name="txtSimuBasi" id="txtSimuBasi" value="0" onBlur="recalcularSimulacion();">
                                    </div> 
                                </div><!-- /.form-group -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.box-body -->
                </div><!-- /.box -->

                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">Analisis Riesgo Centrales</h3>
                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div><!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Embargado</label>
                                    <select class="form-control select2" style="width: 100%;" name="slSimuEmba" id="slSimuEmba">
                                        <option></option>
                                        <option>Si</option>
                                        <option>No</option>
                                    </select>
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Tipo Contrato</label>
                                    <select class="form-control select2" style="width: 100%;" name="slSimuCont" id="slSimuCont">
                                        <option></option>
                                        <option>Termio Fijo</option>
                                        <option>Indefinido</option>
                                        <option>Pensionado</option>
                                    </select>
                                </div><!-- /.form-group -->
                            </div><!-- /.col -->
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Puntaje Cifin</label>
                                    <input class="form-control" type="text" name="txtSimuCifi" id="txtSimuCifi" placeholder="ejemplo">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Puntaje DataCredito</label>
                                    <input class="form-control" type="text" name="txtSimuData" id="txtSimuData" placeholder="ejemplo">
                                </div><!-- /.form-group -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.box-body -->
                </div><!-- /.box -->

                <div class="box box-success">
                    <div class="box-header">
                      <i class="fa fa-comments-o"></i>
                      <h3 class="box-title">Observaciones</h3>
                    </div>

                    <div class="box-body chat" id="chat-box">
                        <div class="item">
                            <img src="dist/img/user3-128x128.jpg" alt="user image" class="online">
                            <p class="message">
                                <a href="#" class="name">
                                    <small class="text-muted pull-right"><i class="fa fa-clock-o"></i> 5:15</small>
                                    Alexander Pierce
                                </a>
                                    I would like to meet you to discuss the latest news about
                                    the arrival of the new theme. They say it is going to be one the
                                    best themes on the market
                            </p>
                        </div><!-- /.item -->
                      <!-- chat item -->
                        <div class="item">
                            <img src="dist/img/user2-160x160.jpg" alt="user image" class="offline">
                            <p class="message">
                                <a href="#" class="name">
                                    <small class="text-muted pull-right"><i class="fa fa-clock-o"></i> 5:30</small>
                                    Susan Doe
                                </a>
                                    I would like to meet you to discuss the latest news about
                                    the arrival of the new theme. They say it is going to be one the
                                    best themes on the market
                            </p>
                        </div><!-- /.item -->
                    </div><!-- /.chat -->

                    <div class="box-footer">
                        <div class="input-group">
                            <input class="form-control" name="txtSimuObse" id="txtSimuObse" placeholder="Observaciones...">
                            <div class="input-group-btn">
                                <button class="btn btn-success"><i class="fa fa-plus"></i></button>
                            </div>
                        </div>
                    </div>
                </div><!-- /.box (chat box) -->
            </div>
            <!-- Columna Izquierda -->


            <!-- Columna Derecha -->
                <div class="col-md-6">
                  <div class="box box-default">
                     <div class="box-header with-border">
                  <h3 class="box-title">Analisis Riesgo</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div><!-- /.box-header -->
                    <div class="box-body">
                      <div class="row">
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Ingresos Adicionales</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuAdic" id="txtSimuAdic" value="0" onBlur="recalcularSimulacion()">
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Total Ingresos</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuTing" id="txtSimuTing" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Ingresos Menos Aportes</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuInapo" id="txtSimuInapo" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Aportes de Ley</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuApor" id="txtSimuApor" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Total Egresos</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                            <input type="text" class="form-control" name="txtSimuTegr" id="txtSimuTegr" value="0" onblur="recalcularSimulacion()">
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Salario Libre Mensual</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuSlib" id="txtSimuSlib" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      </div><!-- /.col -->
                  </div><!-- /.row -->
                    </div><!-- /.box-body -->
                  </div><!-- /.box -->
                  <div class="box box-default">
                     <div class="box-header with-border">
                  <h3 class="box-title">Condiciones Credito</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div><!-- /.box-header -->
                    <div class="box-body">
                      <div class="row">
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Cuota</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuCuot" id="txtSimuCuot" onBlur="recalcularSimulacion()" value="0">
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Valor Credito</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuCred" id="txtSimuCred" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <!-- /.form-group -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Plazo</label>
                        <input class="form-control" type="text" placeholder="ejemplo" name="txtSimuPlaz" id="txtSimuPlaz" onBlur="recalcularSimulacion()" value="84">
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Tasa</label>
                        <input class="form-control" type="text" placeholder="ejemplo" name="txtSimuTasa" id="txtSimuTasa" onBlur="recalcularSimulacion()" value="1.2">
                      </div><!-- /.form-group -->
                      <!-- /.form-group -->
                      </div><!-- /.col -->
                  </div><!-- /.row -->
                    </div><!-- /.box-body -->
                  </div><!-- /.box -->
                  <div class="box box-default">
                     <div class="box-header with-border">
                  <h3 class="box-title">Costos Administrativos</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div><!-- /.box-header -->
                    <div class="box-body">
                      <div class="row">
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Asesoria Financiera</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuAfin" id="txtSimuAfin" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>IVA</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuIva" id="txtSimuIva" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <!-- /.form-group -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Papeleria</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuPape" id="txtSimuPape" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>GMF</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuGmf" id="txtSimuGmf" value="0" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <!-- /.form-group -->
                      </div><!-- /.col -->
                  </div><!-- /.row -->
                    </div><!-- /.box-body -->
                  </div><!-- /.box -->
                  <div class="box box-default">
                <div class="box-header with-border">
                  <h3 class="box-title">Generales</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div class="row">
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Valor Desembolso</label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                        <input type="text" class="form-control" name="txtSimuDese" id="txtSimuDese" readonly>
                        </div> 
                      </div><!-- /.form-group -->
                      <div class="form-group">
                        <label>Decision</label>
                        <input class="form-control" type="text" name="txtSimuDeci" id="txtSimuDeci" placeholder="ejemplo">
                      </div><!-- /.form-group -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <div class="form-group">
                        <label>Subestado</label>
                        <select class="form-control select2" style="width: 100%;" name="txtSimuSube" id="txtSimuSube">
                          <option></option>
                          <option>Termio Fijo</option>
                          <option>Indefinido</option>
                          <option>Pensionado</option>
                        </select>
                      </div><!-- /.form-group -->
                    </div><!-- /.col -->
                  </div><!-- /.row -->
                </div><!-- /.box-body -->

              </div>

                </div><!-- /.col -->

        </div>

                <div class="col-md-2"></div>
                <div class="col-md-4">
                    <input type="button" value="Guardar" id="btGuardar" name ="btGuardar" class="btn btn-info pull-right" onClick="sendForm()"/>
                </div>
                <br>
                <br> 
    </section>
</form>
<jsp:include page="footer.jsp" />
