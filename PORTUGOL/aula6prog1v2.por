programa
{
	
	funcao inicio()
	{
		cadeia nomes[3], resultados[3]
		real notas[3]
		inteiro qalunos = 0
		para(inteiro y = 0; y <= 2; y++)
		{
		escreva("Escreva o nome do aluno: ")
		leia(nomes[y])
		escreva("Escreva a nota do aluno: ")
		leia(notas[y])
		se(notas[y] <= 5)
		{
			resultados[y] = "REC"
		}
		senao
		{
			resultados[y] = "APROVADO"
		}
		}
		escreva("\nAluno\t\tNota\t\tSituação\n")
		inteiro y2 = 0
		enquanto(y2 <= 2)
		{
			escreva(nomes[y2]+"\t\t"+notas[y2]+"\t\t"+resultados[y2]+"\n")
			y2++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */