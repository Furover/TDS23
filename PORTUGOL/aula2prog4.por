programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		inteiro a
		inteiro b
		inteiro c
		inteiro d
		inteiro ve
		inteiro f
		inteiro x
		inteiro y
		escreva("Digite a nota de peso a:")
		leia(a)
		escreva("\nDigite a nota de peso b:")
		leia(b)
		escreva("\nDigite a nota de peso c:")
		leia(c)
		escreva("\nDigite a nota de peso d:")
		leia(d)
		escreva("\nDigite a nota de peso e:")
		leia(ve)
		escreva("\nDigite a nota de peso f:")
		leia(f)
		x = ((c*ve) - (b*f)) / ((a * ve) - (b * d))
		y = ((a*f) - (c*d)) / ((a * ve) - (b * d))
		escreva("\nResultado de x: "+x)
		escreva("\nResultado de y: "+y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {f, 11, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */