programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real n1
		real n2
		real n3
		real n4
		escreva("Digite a nota de peso 2:")
		leia(n1)
		escreva("\nDigite a nota de peso 3:")
		leia(n2)
		escreva("\nDigite a nota de peso 5:")
		leia(n3)
		n1 = n1 * 0.2
		n2 = n2 * 0.3
		n3 = n3 * 0.5
		n4 = n1 + n2 + n3
		Matematica.arredondar(n4,2)
		escreva("Média do bimestre: "+n4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */