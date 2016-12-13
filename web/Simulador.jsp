<%-- 
    Document   : Simulador
    Created on : 27/11/2016, 07:41:19 AM
    Author     : Juan y Karol
--%>

<%@page import="Objetos.Simulado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<script src="app/simulador.js"></script>
<script>
    $(document).ready(function()
    {
        var SimuCodi = getParameterByName('urlSimuCodi');
        
        if(SimuCodi !== null)
        {
            $.post('SSimulado',
            {
                SimuCodi : SimuCodi
            },
            function(responseText)
            {
                alert('ajax0 - '+responseText[0]);
                alert('ajax1 - '+responseText[1]);
                alert('ajax2 - '+responseText[2]);
                alert('ajax3 - '+responseText[3]);
                alert('ajax4 - '+responseText[4]);
                alert('ajax5 - '+responseText[5]);
                alert('ajax6 - '+responseText[6]);
                alert('ajax7 - '+responseText[7]);
                alert('ajax8 - '+responseText[8]);
                alert('ajax9 - '+responseText[9]);
                alert('ajax10 - '+responseText[10]);
                alert('ajax11 - '+responseText[11]);
                alert('ajax12 - '+responseText[12]);
                alert('ajax13 - '+responseText[13]);
                alert('ajax14 - '+responseText[14]);
                alert('ajax15 - '+responseText[15]);
            });
        }
    });
    function sendForm()
    {
        //CLIENTES
        var ClieIden = $('#txSimuCedu').val();
        var ClieNom1 = $('#txSimuNom1').val();
        var ClieNom2 = $('#txSimuNom2').val();
        var ClieApe1 = $('#txtSimuApe1').val();
        var ClieApe2 = $('#txSimuApe2').val();
        var ClieNaci = $('#txtSimuNaci').val();
        var ClieTele = $('#txSimuTele').val();
        var ClieDire = $('#txSimuDire').val();
        var ClieMail = $('#txtSimuMail').val();
        var ClieBasi = $('#txtSimuBasi').val();
        
        //SIMULADO
        var SimuEmba = $('#slSimuEmba').val();
        var SimuTico = $('#slSimuCont').val();
        var SimuPucn = $('#txtSimuCifi').val();
        var SimuPudc = $('#txtSimuData').val();
        var SiobObse = $('#txtSimuObse').val();
        var SimuAdic = $('#txtSimuAdic').val();
        var SimuToin = $('#txtSimuTing').val();
        var SimuInma = $('#txtSimuInapo').val();
        var SimuAple = $('#txtSimuApor').val();
        var SimuToeg = $('#txtSimuTegr').val();
        var SimuSalm = $('#txtSimuSlib').val();
        var SimuCuot = $('#txtSimuCuot').val();
        var SimuVlcr = $('#txtSimuCred').val();
        var SimuPlaz = $('#txtSimuPlaz').val();
        var SimuAsfi = $('#txtSimuAfin').val();
        var SimuIva = $('#txtSimuIva').val();
        var SimuPape = $('#txtSimuPape').val();
        var SimuGmf = $('#txtSimuGmf').val();
        var SimuVlde = $('#txtSimuDese').val();
        var SimuOdli = $('#txtSimuDeci').val();
        var SimuEsta = $('#txtSimuSube').val();
        var SimuTasa = $('#txtSimuTasa').val();
        
        $.post('SSimulado',
        {
            txClieIden : ClieIden,
            txClieNom1 : ClieNom1,
            txClieNom2 : ClieNom2,
            txClieApe1 : ClieApe1,
            txClieApe2 : ClieApe2,
            txClieFena : ClieNaci,
            txClieTel1 : ClieTele,
            txClieDire : ClieDire,
            txClieCorr : ClieMail,
            txClieSaba : ClieBasi,
            SimuEmba : SimuEmba,
            SimuTico : SimuTico,
            SimuPucn : SimuPucn,
            SimuPudc : SimuPudc,
            SiobObse : SiobObse,
            SimuAdic : SimuAdic,
            SimuToin : SimuToin,
            SimuInma : SimuInma,
            SimuAple : SimuAple,
            SimuToeg : SimuToeg,
            SimuSalm : SimuSalm,
            SimuCuot : SimuCuot,
            SimuVlcr : SimuVlcr,
            SimuPlaz : SimuPlaz,
            SimuAsfi : SimuAsfi,
            SimuIva  : SimuIva,
            SimuPape : SimuPape,
            SimuGmf  : SimuGmf,
            SimuVlde : SimuVlde,
            SimuOdli : SimuOdli,
            SimuEsta : SimuEsta,
            SimuTasa : SimuTasa
            },
            function(responseText)
            {
                $('#tabla').html(responseText);
            });
    }
    function getParameterByName(name, url)
    {
        if (!url)
        {
            url = window.location.href;
        }
        name = name.replace(/[\[\]]/g, "\\$&");
        var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
        if (!results) return null;
        if (!results[2]) return '';
        return decodeURIComponent(results[2].replace(/\+/g, " "));
    }
</script>
<%
    Simulado Simu = new Simulado();
    Simu = (Simulado)request.getAttribute("Simulado");
%>
<form id="fmSimulado" name="fmSimulado" method="get">
    <div id="prueba"></div>
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
                                    <input class="form-control" name="txtSimuApe1" id="txtSimuApe1" type="text" placeholder="Primer Apellido Cliente">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Primer Nombre</label>
                                    <input class="form-control" type="text" name="txSimuNom1" id="txSimuNom1" placeholder="Primer Nombre Cliente">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Cedula</label>
                                    <input class="form-control" type="text" name="txSimuCedu" id="txSimuCedu" placeholder="Identificación del Cliente">
                                </div><!-- /.form-group --> 

                                <div class="form-group">
                                    <label>Contacto:</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-phone"></i>
                                        </div>
                                        <input type="text" class="form-control" name="txSimuTele" id="txSimuTele" placeholder="Numero de Telefono Cliente">
                                    </div><!-- /.input group -->
                                </div><!-- /.form group --><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Direccion</label>
                                    <input class="form-control" name="txSimuDire" id="txSimuDire" type="text" placeholder="Direccion de Vivienda Cliente">
                                </div><!-- /.form-group -->
                            </div><!-- /.col -->

                            <div class="col-md-6">
                                <div class="form-group">
                                  <label>Segundo Apellido</label>
                                  <input class="form-control" type="text" name="txSimuApe2" id="txSimuApe2" placeholder="Segundo Apellido del Cliente">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                  <label>Segundo Nombre</label>
                                  <input class="form-control" type="text" name="txSimuNom2" id="txSimuNom2" placeholder="Segundo Nombre del Cliente">
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                  <label>Fecha Nacimiento</label>
                                  <input class="form-control" type="text" name="txtSimuNaci" id="txtSimuNaci" placeholder="Fecha Nacimiento Cliente">
                                </div>

                                <div class="form-group">
                                    <label>eMail</label>
                                    <div class="input-group">
                                        <span class="input-group-addon">@</span>
                                        <input type="text" class="form-control" name="txtSimuMail" id="txtSimuMail" placeholder="Correo Cliente">
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
                                        <option value="N">No</option>
                                        <option value="S">Si</option>
                                    </select>
                                </div><!-- /.form-group -->

                                <div class="form-group">
                                    <label>Tipo Contrato</label>
                                    <select class="form-control select2" style="width: 100%;" name="slSimuCont" id="slSimuCont">
                                        <option value="T">Termio Fijo</option>
                                        <option value="I">Indefinido</option>
                                        <option value="P">Pensionado</option>
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

                <!--<div class="box box-success">
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
                        </div><!-- /.item
                      <!-- chat item
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
                        </div><!-- /.item
                    </div><!-- /.chat

                    <div class="box-footer">
                        <div class="input-group">
                            <input class="form-control" name="txtSimuObse" id="txtSimuObse" placeholder="Observaciones...">
                            <div class="input-group-btn">
                                <button class="btn btn-success"><i class="fa fa-plus"></i></button>
                            </div>
                        </div>
                    </div>
                <!--</div><!-- /.box (chat box) -->
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
                          <option value="pro">Procesado</option>
                          <option value="rad">Radicado</option>
                          <option value="fir">Firmado</option>
                          <option value="con">Confirmado</option>
                          <option value="cup">Cupo</option>
                          <option value="emb">Embargado</option>
                          <option value="tco">Tipo Contrato</option>
                          <option value="pol">Politicas</option>
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
