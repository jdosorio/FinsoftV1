<%-- 
    Document   : login
    Created on : 10-oct-2016, 18:43:38
    Author     : Juan Osorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html lang="es">
<head>
	<meta charset="utf-8" />
	<title>Iniciar Sesion</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="FinSoft" />
	<link href="assets/login/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/login/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/login/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="assets/login/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="assets/login/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="assets/login/css/themes/blue.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="assets/login/css/pages/login-soft.css" rel="stylesheet" type="text/css"/>
	<link rel="shortcut icon" href="favicon.ico" />
</head>

<body class="login">
	
	<div class="logo">
		<img src="assets/img/login-logo.png" class="img-responsive" alt="Responsive image">
	</div>
	
	<div class="content">
		<form class="form-vertical login-form" action="Slogin" method="post">
			<h3 class="form-title">Ingresar Credenciales</h3>
			<div class="alert alert-error hide">
				<button class="close" data-dismiss="alert"></button>
				<span>Ingresa tu usuario y contrasena.</span>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Usuario</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i>
						<input class="m-wrap placeholder-no-fix" type="text" autocomplete="off" placeholder="Usuario" name="txUsuaNick" id="txUsuaNick"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Contrasena</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i>
						<input class="m-wrap placeholder-no-fix" type="password" autocomplete="off" placeholder="Contraseña" name="txUsuaPass"/>
					</div>
				</div>
			</div>
			<div class="form-actions">
				<button type="submit" class="btn blue pull-right">
				Ingresar <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
			
		</form>
	</div>
	<div class="copyright">
            <b>FinSoft S.A.S &copy;</b>
	</div>
	<script src="assets/login/scripts/app.js" type="text/javascript"></script>
	<script src="assets/login/scripts/login-soft.js" type="text/javascript"></script>      
</body>
</html>