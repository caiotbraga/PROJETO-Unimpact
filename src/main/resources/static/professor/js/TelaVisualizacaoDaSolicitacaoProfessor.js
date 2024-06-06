function divDadosQueDevemAparecerParaOIntermediador(){
    var clicouParaFazerSolicitacaoComoPessoaJuridica = getElementById("cadastro-juridico");

    if(clicouParaFazerSolicitacaoComoPessoaJuridica == true){
        cadastroJuridico.style.display = "block"
    }
    else{
		cadastroJuridico.style.display = "none"
	}
}