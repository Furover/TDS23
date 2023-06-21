programa
{
	
	funcao inicio()
	{
		const cadeia senha = "1234"
		cadeia teste = ""
		inteiro numero = 0
		inteiro total = 0
		
		escreva("Digite a senha: ")
		leia(teste)
		
		faca
		{
			escreva("Digite um número: ")
			leia(numero)
			se(numero < 0)
			{
				escreva("Não é aceito números negativos.")
				pare
			}
			total += numero
			escreva("Digite a senha: ")
			leia(teste)
			se(teste != senha)
			{
				escreva("\n\n----------------")
				escreva("\nSenha incorreta")
				escreva("\n----------------\n\n")
			}
		}
		enquanto(teste == senha)
		escreva("\nTotal da soma dos números digitados: "+total)
		escreva("\n\n\nFim do programa!!!")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */