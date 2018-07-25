function validate(){

if(formDespesa.descricao.value==""){
alert("Preencha o campo descrição!!!");
formDespesa.descricao.focus();
return;
}
if(formDespesa.valor.value==""){
alert("Preencha o campo valor!!!");
formDespesa.valor.focus();
return;
}
if(formDespesa.vencimento.value==""){
alert("Preencha o campo vencimento!!!");
formDespesa.vencimento.focus();
return;
}

formDespesa.submit();

}
