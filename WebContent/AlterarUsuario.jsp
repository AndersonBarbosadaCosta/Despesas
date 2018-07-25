<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="dao.UsuarioDao"/>

<html>
<head>
<script type="text/javascript" src="js/validaUsuario.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body  bgcolor="cyan">
<%="Olá "+ request.getSession().getAttribute("logon") %>

<table border="1" bgcolor="cyan" align="center" width="60%">
	<caption>Usuarios Cadastradas no Sistema</caption>
	<tr>
		<td align="center"><font color="red" size="4">Id</font></td>
		<td align="center"><font color="red" size="4">Login </font></td>
		</tr>
	<c:forEach var="usuario2" items="${dao.usuarios}" varStatus="id">
		<tr>
			<td align="center">${usuario2.idUsuario }</td>
			<td align="center">${usuario2.login}</td>
			</tr>
	</c:forEach>
</table>
<p>
<form action="Controlador?acao=AlterarUsuario" method="post" name="form"> 
<table bgcolor="cyan" width="80%" align="center" border="0"  > 

<caption ><font color="black" size="5">Formulario de Alteração de Usuario </font> </caption>
<tr>
<td colspan="1"><font color=black size="3" ><b>

Usuario:<select name="selUsuario"><c:forEach var="usuarioSel" items="${dao.usuarios}"> <option> ${usuarioSel.idUsuario}</option></c:forEach></select><br>
Login: <input name="usuario" type="text" maxlength="40"><br>
Senha: <input name="senhaUser" type="password" maxlength="8" ><br>

</b></font></td>
</tr>
<tr>
<td align="center">
<input name="Alterar" type="button" value="Alterar" onclick="validate(this.value)">
<input name="limpar" type="reset"  value="Limpar">
<h3 align="right"><a href="BemVindo.jsp">Menu</a></h3>
</td>
</tr>
</table>
</form>
</body>
</html>