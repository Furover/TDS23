programa
{
	inclua biblioteca Calendario
	inclua biblioteca Matematica
	funcao inicio()
	{
		inteiro a
		inteiro b
		inteiro c
		inteiro r
		inteiro s
		inteiro d
		escreva("Digite o número A: ")
		leia(a)
		se(a >= 0)
		{
			escreva("\nDigite o número B: ")
			leia(b)
			se(b >= 0)
			{
				escreva("\nDigite o número C: ")
				leia(c)
				se(c >= 0)
				{
					r= Matematica.potencia((a+b),2)
					s= Matematica.potencia((b+c),2)
					d= (r + s) / 2
					escreva("\nO resultado da operação foi: "+d)
				}
				senao
				{
					escreva("\nEscreva um número positivo por favor")
				}
			}
			senao
			{
				escreva("\nEscreva um número positivo por favor")
			}
		}
		senao
		{
			escreva("\nEscreva um número positivo por favor")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */