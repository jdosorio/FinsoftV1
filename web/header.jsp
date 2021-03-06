<%-- 
    Document   : header
    Created on : 19/11/2016, 09:05:30 PM
    Author     : Juan y Karol
--%>
<%@page import="Controlador.CMensajes"%>
<%-- @page import="Objetos.Mensajes" --%>
<%@page import="Objetos.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>FinSoft S.A.S</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script> 
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="plugins/morris/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <%!
            static Usuarios Usua = null;
        %>
        <%
            try
            {
                HttpSession sesion = request.getSession(true);
                Usua = (Usuarios)sesion.getAttribute("usuario");
            }
            catch(Exception x)
            {
                CMensajes.Mensaje(x.toString(), response);
            }
        %>
        <div class="wrapper">        
            <header class="main-header">
        <!-- Logo -->
        <a href="index2.html" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>F</b>N</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>FINSOFT </b>S.A.S</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- Messages: style can be found in dropdown.less-->
              
              <!-- Notifications: style can be found in dropdown.less -->
              
              <!-- Tasks: style can be found in dropdown.less -->
              
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                  <span class="hidden-xs"><% out.println(Usua.getUsuaNom1()+" "+Usua.getUsuaApe1()); %></span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                    <p>
                      <% out.println(Usua.getUsuaNom1()+" "+Usua.getUsuaApe1()); %> - Web Developer
                      <small>Member since Nov. 2012</small>
                    </p>
                  </li>
                  <!-- Menu Body -->
                 
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-right">
                      <a href="login.jsp?stSignOut='TRUE'" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- Control Sidebar Toggle Button -->
              
            </ul>
          </div>
        </nav>
      </header>
      
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
              <p><% out.println(Usua.getUsuaNom1()+" "+Usua.getUsuaApe1()); %></p>
              <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
          </div>
          <!-- search form -->
          
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
               <li class="active treeview">
              <a href="Indicadores.jsp">
                <i class="fa fa-pie-chart"></i> <span>Indicadores</span>
              </a>
            </li>
            <% if(Usua.getUsuaPerf().contains("ADM")){ %>
                <li class="active treeview">
                    <a href="#">
                        <i class="fa fa-cogs"></i> <span>Sistema</span><i class="fa fa-angle-down pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="Usuarios.jsp"><i class="fa fa-user"></i> Gestión Usuarios</a></li>
                        <li><a href="Paraoper.jsp"><i class="fa fa-wrench"></i> Parámetros Generales</a></li>
                        <li><a href="Estados.jsp"><i class="fa fa-wrench"></i> Estados del Sistema</a></li>
                        <li><a href="Perfiles.jsp"><i class="fa fa-wrench"></i> Perfiles del Sistema</a></li>
                        <li><a href="Modulos.jsp"><i class="fa fa-wrench"></i> Módulos del Sistema</a></li>
                        <li><a href="Entibanc.jsp"><i class="fa fa-bank"></i> Entidades Bancarias</a></li>
                    </ul>
                </li>
            <% } %>
            <li class="active treeview">
              <a href="#">
                <i class="fa fa-bank"></i> <span>Módulo de Creditos</span>
              </a>
              <ul class="treeview-menu">
                <!--<li class="active"><a href="Clientes.jsp"><i class="fa fa-user"></i> Clientes</a></li>-->
                <li><a href="Compcacl.jsp"><i class="fa fa-pie-chart"></i> Compra de Cartera</a></li>
                <li><a href="Simulador.jsp"><i class="fa fa-pie-chart"></i> Simulador</a></li>
                <li><a href="Simulaciones.jsp"><i class="fa fa-pie-chart"></i> Simulaciones</a></li>
              </ul>
            </li>
            <li class="active treeview">
              <a href="#">
                <i class="fa fa-file-pdf-o"></i> <span>Módulo Reportes</span>
              </a>
              <ul class="treeview-menu">
                <li class="active"><a href="RUsuarios.jsp"><i class="fa fa-user"></i> Usuarios del Sistema</a></li>
                <li><a href="RClientes.jsp"><i class="fa fa-wrench"></i> Clientes del Sistema</a></li>
              </ul>
            </li>
        </section>
        <!-- /.sidebar -->
      </aside>
            <div class="content-wrapper">
