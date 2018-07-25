<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/validaUsuario.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body onload="defaultStatus=('Seja Bem Vindo!!!')">


<%="Olá " + request.getSession().getAttribute("logon")%>
<table width="80%" bgcolor="white">
	<caption><font size="5">Formulario de Cadastro de Usuario</font></caption>
	<tr>
		<td>

		<form action="Controlador?acao=GravarUsuario" method="post" name="form">
		Login: <input name="usuario" type="text"maxlength="20"><br>
		Senha: <input name="senhaUser" type="password" maxlength="8"	><br>
		<input name="btnEnviar" type="button" value="Cadastrar" onclick="validate(this.value)">
		 <input name="btnLimpar" type="reset" value="Limpar"></form>

		</td>

	</tr>
	<tr>
		<td>
		<h3 align="right"><a href="BemVindo.jsp">Menu</a></h3>
		</td>
	</tr>
</table>
</body>
</html>