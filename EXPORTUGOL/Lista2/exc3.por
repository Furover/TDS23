programa
{
	
	funcao inicio()
	{
		inteiro n = 0
		real m = 0.00, t = 0.00, s = 0.00
		escreva("Digite um número: ")
		leia(n)
		se(n < 0)
		{
			escreva("Digite somente números positivos.")
		}
		enquanto(n >= 0)
		{
			t++
			s += n
			escreva("Digite um número: ")
			leia(n)
		}
		m = s / t
		escreva("O valor médio dos números positivos que você digitou foi "+m+" de "+t+" números digitados\n")
		escreva("e a somatória deles equivale a "+s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */