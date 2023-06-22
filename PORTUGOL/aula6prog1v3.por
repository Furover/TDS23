programa
{
	
	funcao inicio()
	{
		cadeia nomes[3], resultados[3]
		real notas[3] = {0.00,0.00,0.00}
		inteiro qalunos = 0
		nomes[0] = "MARIA"
		nomes[1] = "JOAO"
		nomes[2] = "FABRICIO"

		linhas(80)
		pula()
		escreva(nomes[0])
		pula()
		linhas(80)
		pula()
		escreva(nomes[1])
		pula()
		linhas(80)
		pula()
		escreva(nomes[2])
		pula()
		linhas(80)
		
	}
	funcao pula()
	{
		escreva("\n")
	}
	funcao linhas(inteiro tamanho)
	{
		para(inteiro x = 1; x <= tamanho; x++)
		{
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */