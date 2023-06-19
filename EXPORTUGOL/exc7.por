programa
{
	
	funcao inicio()
	{
		real b = 0.00
		real h = 0.00	
		real a = 0.00
		escreva("Digite o valor da base do triângulo:")
		leia(b)
		escreva("Digite o valor da altura do triângulo:")
		leia(h)
		se(b > 0 e h > 0)
		{
			a = b * h / 2
			escreva("O valor da área desse triângulo é: "+a)
		}
		senao
		{
			escreva("Digite valores válidos para a altura e base, eles devem ser maior que 0.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */