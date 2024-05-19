function divPessoaJuridica(){
	var radioSim = document.getElementById("radio-sim");
	var radioNão = document.getElementById("radio-nao");
	var cadastroJuridico = document.getElementById("cadastro-jurico")

	if(radioSim.checked == true){
		cadastroJuridico.style.display = "block"
	}
	else{
		cadastroJuridico.style.display = "none"
	}
}

alert("teste");