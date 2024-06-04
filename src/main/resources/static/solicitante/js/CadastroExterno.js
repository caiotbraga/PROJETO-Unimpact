document.getElementById('cadastroForm').addEventListener('submit', function(event) {
            event.preventDefault();

            const usuario = {
                nome: document.getElementById('nome').value,
                cpf: document.getElementById('cpf').value,
                rg: document.getElementById('rg').value,
                telefone1: document.getElementById('telefone1').value,
                telefone2: document.getElementById('telefone2').value,
                cep: document.getElementById('cep').value,
                rua: document.getElementById('rua').value,
                estado: document.getElementById('estado').value,
                bairro: document.getElementById('bairro').value,
                numero: document.getElementById('numero').value,
                complemento: document.getElementById('complemento').value,
                email: document.getElementById('email').value,
                senha: document.getElementById('senha').value
            };

            fetch('/api/v1/usuarios', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(usuario)
            }).then(response => {
                if (response.ok) {
                    alert('Usuário cadastrado com sucesso!');
                } else {
                    alert('Erro ao cadastrar usuário.');
                }
            }).catch(error => {
                alert('Erro ao cadastrar usuário.');
            });
        });