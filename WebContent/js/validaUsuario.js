
function validate(){

if(form.usuario.value==""){
alert("Preencha o campo usu�rio!!!");
form.usuario.focus();
return;
}
if(form.senhaUser.value==""){
alert("Preencha o campo senha!!!");
form.senhaUser.focus();
return;
}

form.submit();

}



