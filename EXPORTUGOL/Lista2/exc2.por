programa
{
	
	funcao inicio()
	{
		inteiro somatotal = 0
		escreva("\n--------------------------------------")
		escreva("\nQual a soma dos números entre 1 a 500?")
		escreva("\n--------------------------------------\n\n")
		para(inteiro x = 1; x <=500;x++)
		{
			se(x % 3 == 0 e x % 2 != 0)
			{
				somatotal += x
			}
		}
		escreva("... e a resposta para essa pergunta é: "+somatotal+"\n\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */