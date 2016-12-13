<%-- 
    Document   : Indicadores
    Created on : 10/12/2016, 09:34:01 AM
    Author     : Juan y Karol
--%>

<%@page import="Controlador.CSimulador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />

<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

    <section class="content">
        <div class="row">
            <div class="col-md-6">
                <div class="box box-default">
                   <div class="box-header with-border">
                        <h3 class="box-title">Colocacion Total</h3>
                        <div class="box-tools pull-right">
                          <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <script type="text/javascript">
                              google.charts.load("current", {packages:["corechart"]});
                              google.charts.setOnLoadCallback(drawChart);
                              function drawChart() {
                                var data = google.visualization.arrayToDataTable([
                                  ['Comercial', 'Colocacion'],
                                  <% 
                                    CSimulador cSimu = new CSimulador();
                                    String arr[][] =  cSimu.Listar();
                                    int tamano = arr.length;
                                    for(int i=0;i<tamano;i++){
                                        String uno="";
                                        if(i == tamano-1){
                                            uno += "]";
                                        }else{
                                            uno += "],";
                                        }                 
                                        out.println( "['"+arr[i][1]+"',"+ arr[i][2]+uno);
                                    }
                                  %>
                                ]);

                              var options = {
                                legend: 'none',
                                pieSliceText: 'label',
                                title: 'Colocacion total a la fecha',
                                pieStartAngle: 100,
                                is3D: true
                              };

                                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                                chart.draw(data, options);
                              }
                            </script>
                            
                       <div id="piechart" style="width: 500px; height: 500px;"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="box box-default">
                   <div class="box-header with-border">
                        <h3 class="box-title">Desembolso Total</h3>
                        <div class="box-tools pull-right">
                          <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                            <script type="text/javascript">
                              google.charts.load("current", {packages:["corechart"]});
                              google.charts.setOnLoadCallback(drawChart);
                              function drawChart() {
                                var data = google.visualization.arrayToDataTable([
                                  ['Language', 'Speakers (in millions)'],
                                  ['German',  5.85],
                                  ['French',  1.66],
                                  ['Italian', 0.316],
                                  ['Romansh', 0.0791]
                                ]);

                              var options = {
                                legend: 'none',
                                pieSliceText: 'label',
                                title: 'Desembolso total a la fecha',
                                pieStartAngle: 100,
                              };

                                var chart = new google.visualization.PieChart(document.getElementById('chart'));
                                chart.draw(data, options);
                              }
                            </script>
                                <div id="chart" style="width: 500px; height: 500px;"></div>
                                <div id="tabla"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>


<jsp:include page="footer.jsp" />