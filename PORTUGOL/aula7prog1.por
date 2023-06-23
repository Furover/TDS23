programa
{
	
	funcao inicio()
	{
		inteiro n[5], nm[2]
		para(inteiro y = 0; y <= 4; y++)
		{
			escreva("Digite a pontuação:\n")
			leia(n[y])
			se(n[y] > nm[0])
			{
				nm[0] = n[y]
				nm[1] = y
			}
		}
		escreva("A maior pontuação digitada foi "+nm[0]+" e seu vetor é "+nm[1])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */