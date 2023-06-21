programa
{
	
	funcao inicio()
	{
		inteiro n = 0, t = 0, s = 0
		real m = 0.00
		escreva("Digite um número: ")
		leia(n)
		se(n < 0)
		{
			escreva("Escreva somente números positivos.")
		}
		enquanto(n >= 0)
		{
			t++
			s += n
			escreva("Digite um número: ")
			leia(n)
		}
		m = s / t
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