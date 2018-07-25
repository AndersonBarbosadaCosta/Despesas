<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="dao.DespesaDAO"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body  bgcolor="cyan">
<%="Olá "+ request.getSession().getAttribute("logon") %>

<table border="1" bgcolor="cyan" align="center" width="60%">
	<caption ><font color="black" size="5">Despesas Cadastradas no Sistema</font></caption><br>
	<tr>
	    <td><font color="red" size="4">Id Despesa </font></td>
		<td><font color="red" size="4">Descrição </font></td>
		<td><font color="red" size="4">Valor </font></td>
		<td><font color="red" size="4">Vencimento</font></td>
		<td><font color="red" size="4">Qtde Parcelas</font></td>
		<td><font color="red" size="4">Prioridade</font></td>
	</tr>
	<c:forEach var="despesa" items="${dao.lista}" varStatus="id">
		<tr>
		    <td>${despesa.idDespesa}</td>
			<td>${despesa.descricao}</td>
			<td>${despesa.valor}</td>
			<td>${despesa.vencimento}</td>
			<td>${despesa.numParcelas}</td>
			<td>${despesa.prioridade}</td>
			

		</tr>
	</c:forEach>
</table>
<p>
<form action="Controlador?acao=AlterarDespesa" method="post"> 
<table bgcolor="cyan" width="80%" align="center" border="0"  > 

<caption ><font color="black" size="5">Formulario de Alteração de Despesa </font> </caption>
<tr>
<td colspan="1"><font color=black size="3" ><b>
Despesa:<select name="idDespesa"><c:forEach var="despesaSel" items="${dao.lista}"><option> ${despesaSel.idDespesa}</option> </c:forEach> </select><br>
Descrição: <input name="descricao" type="text" maxlength="40"><br>
Valor  R$: <input name="valor" type="text" maxlength="10" ><br>
Vencimento: <input name="vencimento" type="text"><br>
Numero de Parcelas: <input name="numParcelas" type="text" maxlength="3"><br>
Prioridade: <input name="prioridade" type="radio" value="urgente">urgente
<input name="prioridade" type="radio" value="normal" >normal<br>
Usuario:<input name="usuario" type="text" readonly="readonly"   value="<%= request.getSession().getAttribute("logon")  %>">
</b></font></td>
</tr>
<tr>
<td align="center">
<input name="salvar" type="submit" value="Salvar" >
<input name="limpar" type="reset"  value="Limpar">
<h3 align="right"><a href="BemVindo.jsp">Menu</a></h3>
</td>
</tr>
</table>
</form>
</body>
</html>