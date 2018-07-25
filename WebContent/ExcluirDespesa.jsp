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
<body bgcolor="cyan">
<form action="Controlador?acao=ExcluirDespesa" method="post">
<h3 align="center">Formulario de Exclusão de Usuarios</h3>
<table>
	<tr>
		<td>Despesa: <select name="despesas">
			<c:forEach var="despesa" items="${dao.lista}">
				<option>${despesa.descricao}</option>
			</c:forEach>
		</select></td>

		<td><input name="Excluir" type="submit" value="Excluir">
		</td>
	</tr>
	<tr>
	<td><h3 align="right"><a href="BemVindo.jsp">Menu</a></h3>
	</td></tr>
</table>
</form>

</body>
</html>