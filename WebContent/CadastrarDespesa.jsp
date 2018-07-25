<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/validaDespesa.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Controle Orçamentario</title>
</head>
<body bgcolor="white">
<form action="Controlador?acao=GravarDespesa" method="post" name="formDespesa" >

<table bgcolor="white" width="80%" > 
<caption ><font color="black" size="5">Cadastro de Despesas </font> </caption>
<tr>
<td><font color=gray size="3"><b>

Descrição: <input name="descricao" type="text" maxlength="40"><br>
Valor  R$: <input name="valor" type="text" maxlength="10"><br>
Vencimento: <input name="vencimento" type="text"><br>
Numero de Parcelas: <select name="numParcelas" > <option>1</option>
<option> 2 </option>
<option> 3 </option>
<option> 4 </option>
<option> 5 </option>
<option> 6  </option>
<option> 7</option>
<option> 8 </option>
<option> 9  </option>
<option> 10 </option>
<option> 12 </option>
<option> 24  </option>
<option> 36 </option>
 </select><br>
Prioridade: <input name="prioridade" type="radio" value="urgente" >urgente
<input name="prioridade" type="radio" value="normal" checked="checked">normal<br>
Usuario:<input name="usuario" type="text" value="<%= request.getSession().getAttribute("logon")  %>">
</b></font></td>

</tr>
<tr>
<td align="center">
<input name="salvar" type="button" value="Salvar" onclick="validate(this.value)">
<input name="limpar" type="reset"  value="Limpar">
</td>
</tr>
<tr><td><h3 align="right"><a href="BemVindo.jsp">Menu</a></h3></td></tr>
</table>
</form>

</body>
</html>