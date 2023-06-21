programa
{
	
	funcao inicio()
	{
		inteiro n = 0
		inteiro cn = 0
		inteiro cp = 0
		inteiro tn = 0
		inteiro tp = 0
		escreva("Digite um número: ")
		leia(n)
		enquanto(n != 0)
		{
			se(n < 0)
			{
				tn += n
				cn++
			}
			se(n > 0)
			{
				tp += n
				cp++
			}
			escreva("Digite um número: ")
			leia(n)
		}
		escreva("\nForam digitados "+cn+" números negativos e "+cp+" números positivos e no total foram "+(cp+cn)+" digitados\n")
		escreva("Sendo a soma dos negativos igual a: "+tn+"\nE dos positivos: "+tp)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */