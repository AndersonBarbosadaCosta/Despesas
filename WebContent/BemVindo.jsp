<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="Cabecalho.jsp"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body bgcolor="#ffe4c4">

<table width="60%" border="0" align="center">
<thead align="right"><h3 >Sistema de Controle Orçamentário</h3> </thead>
	<tr>
		<td >
		<h3 align="center"><a href="CadastrarDespesa.jsp">Cadastrar
		Despesa</a></h3>
		</td>
	</tr>
	<tr><td>
		<h3 align="center"><a href="CadastrarUsuario.jsp">Cadastrar Usuario
	</a></h3>
		</td></tr>
	<tr><td>
		<h3 align="center"><a href="Controlador?acao=PesquisarDespesa">Listar
		Despesas</a></h3>
		</td></tr>
		<tr><td>
		<h3 align="center"><a href="Controlador?acao=PesquisarUsuario">Listar
		Usuarios</a></h3>
		</td></tr>
		<tr><td>
		<h3 align="center"><a href="AlterarDespesa.jsp">Alterar
		Despesa</a></h3>
		</td></tr>
		<tr><td>
		<h3 align="center"><a href="AlterarUsuario.jsp">Alterar
		Usuario</a></h3>
		</td></tr>
		<tr><td>
		<h3 align="center"><a href="ExcluirDespesa.jsp">Excluir
		Despesas</a></h3>
		</td></tr>
		<tr><td>
		<h3 align="center"><a href="ExcluirUsuario.jsp">Excluir
		Usuario</a></h3>
		</td></tr>
</table>
<c:import url="Rodape.jsp"></c:import>
</body>
</html>