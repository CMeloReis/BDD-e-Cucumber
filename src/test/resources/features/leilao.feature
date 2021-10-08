# language: pt

@leilao
Funcionalidade: Cadastrando um leilao

# SERA EXECUTADO ANTES DOS OUTROS TESTES
	Contexto:
		Dado um usuario logado
	
	Cenario:
		Quando acessa a pagina de novo leilao
		E preenche o formulario com dados validos
		Entao volta para a pagina de leiloes
		E o novo leilao aparece na tabela

 
