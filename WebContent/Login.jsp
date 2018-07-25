<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body>

<table width="80%" bgcolor="white" >
<caption><font size="5">Formulario de Login do Sistema</font></caption>
<tr>
<td>
<form action="Controlador?acao=Logar" method="post">

Login: <input name="login" type="text" maxlength="20"><br>
Senha: <input name="senha" type="password" maxlength="8"><br>
<input name="btnEnviar" type="submit" value="Logar">
<input name="btnLimpar" type="reset" value="Limpar">

</form>
</td>

</tr>
</table>

</body>
</html>