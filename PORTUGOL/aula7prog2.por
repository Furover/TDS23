programa
{
	
	funcao inicio()
	{
		cadeia matrizNomes[3][3]
		matrizNomes[0][0] = "EDUARDO"
		matrizNomes[0][1] = "EMILIA"
		matrizNomes[0][2] = "EDEVAR"
		matrizNomes[1][0] = "EDINILSON"
		matrizNomes[1][1] = "EVERTON"
		matrizNomes[1][2] = "EVANDRO"
		matrizNomes[2][0] = "ERIVANILDO"
		matrizNomes[2][1] = "EDILMA"
		matrizNomes[2][2] = "EDIELSE"

		para(inteiro linha = 0; linha <= 2; linha++)
		{
			para(inteiro coluna = 0; coluna <= 2; coluna++)
			{
				escreva(matrizNomes[linha][coluna]+"\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizNomes, 6, 9, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */