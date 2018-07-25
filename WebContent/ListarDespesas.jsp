<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="dao.DespesaDAO"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body>
<table border="1" bgcolor="white" align="center" width="60%">
	<caption><font size="5">Despesas Cadastradas no Sistema</font></caption>
	<tr>
		<td><font color="red" size="4">Id</font></td>
		<td><font color="red" size="4">Descrição </font></td>
		<td><font color="red" size="4">Valor</font></td>
		<td><font color="red" size="4">Vencimento</font></td>
		<td><font color="red" size="4">Prioridade</font></td>
	</tr>
	<c:forEach var="despesa" items="${dao.lista}" varStatus="id">
		<tr>
			<td>${id.count }</td>
			<td>${despesa.descricao}</td>
			<td>${despesa.valor}</td>
			<td>${despesa.vencimento}</td>
			<td>${despesa.prioridade}</td>

		</tr>
	</c:forEach>
</table>
</body>
</html>