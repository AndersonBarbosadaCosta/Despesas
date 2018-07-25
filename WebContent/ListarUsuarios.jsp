<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="hora" class="java.util.Date" />
<jsp:useBean id="user" class="dao.UsuarioDao"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body>
<fmt:formatDate value="${hora}" />
<table border="1" bgcolor="white" align="center" width="60%">
	<caption><font size="5">Usuarios Cadastradas no Sistema</font></caption>
	<tr>
		<td><font color="red" size="4">Id</font></td>
		<td><font color="red" size="4">Login </font></td>
	</tr>
	<c:forEach var="usuario" items="${user.usuarios}" varStatus="id">
		<tr>
			<td>${id.count }</td>
			<td>${usuario.login}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>