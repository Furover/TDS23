programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro numsor[2][3]
		para(inteiro linha = 0; linha <= 1; linha++)
		{
			para(inteiro coluna = 0; coluna <= 2; coluna++)
			{
				numsor[linha][coluna] = Util.sorteia(1, 60)
				se(linha == 0)
				{
				escreva(numsor[linha][coluna]+"\t")
				}
				senao
				{
					se(linha == 1 e coluna == 0)
					{
						escreva("\n"+numsor[linha][coluna]+"\t")
					}
					senao
					{
						escreva(numsor[linha][coluna]+"\t")
					}
				}
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */