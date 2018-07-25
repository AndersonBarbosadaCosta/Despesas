<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body bgcolor="cyan">
<jsp:useBean id="dao" class="dao.UsuarioDao" />
<form action="Controlador?acao=ExcluirUsuario" method="post">
<h3 align="center">Formulario de Exclusão de Usuarios</h3>
<table>
	<tr>
		<td>
		Usuario: <select name="usuario">

			<c:forEach var="user" items="${dao.usuarios}">
				<option>${user.login}</option>
			</c:forEach>
		</select>
	
		</td>

	<td>
		<input type="submit" title="Excluir" value="Excluir"> 
			
</td>		</tr>
</table>
</form>
</body>
</html>