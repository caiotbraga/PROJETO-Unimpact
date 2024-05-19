
function divPessoaJuridica(){
	var radioSim = document.getElementById("radio-sim");
	var radioNão = document.getElementById("radio-nao");
	var cadastroJuridico = document.getElementById("cadastro-juridico")

	if(radioSim.checked == true){
		cadastroJuridico.style.display = "block"
	}
	else{
		cadastroJuridico.style.display = "none"
	}
}

document.addEventListener('DOMContentLoaded', function() {
    const checkboxes = document.querySelectorAll('.option-checkbox');
    const maximoPermitido = 2;
    const elementoMensagem = document.getElementById('messagem_alertando_o_numero_maximo_permitido_de_escolas_selecionadas');

    checkboxes.forEach(checkbox => {
        checkbox.addEventListener('change', function() {
            const checkedCheckboxes = document.querySelectorAll('.option-checkbox:checked');
            if (checkedCheckboxes.length > maximoPermitido) {
				this.checked = false
                mostrarMensagem('Você só pode selecionar até duas opções.');
            } else {
                apagarMensagem();
            }
        });
    });

    function mostrarMensagem(mensagem) {
        elementoMensagem.textContent = mensagem;
    }

    function apagarMensagem() {
        elementoMensagem.textContent = '';
    }
});
