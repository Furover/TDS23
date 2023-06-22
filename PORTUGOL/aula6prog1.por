programa
{
	
	funcao inicio()
	{
		cadeia nome1, nome2, nome3, resultado1, resultado2, resultado3
		real nota1, nota2, nota3
		escreva("Escreva o nome do aluno: ")
		leia(nome1)
		escreva("Escreva a nota do aluno: ")
		leia(nota1)
		escreva("Escreva o nome do aluno: ")
		leia(nome2)
		escreva("Escreva a nota do aluno: ")
		leia(nota2)
		escreva("Escreva o nome do aluno: ")
		leia(nome3)
		escreva("Escreva a nota do aluno: ")
		leia(nota3)
		se(nota1 <= 5)
		{
			resultado1 = "REC"
		}
		senao
		{
			resultado1 = "APROVADO"
		}
		se(nota2 <= 5)
		{
			resultado2 = "REC"
		}
		senao
		{
			resultado2 = "APROVADO"
		}
		se(nota3 <= 5)
		{
			resultado3 = "REC"
		}
		senao
		{
			resultado3 = "APROVADO"
		}
		escreva("\nAluno\t\tNota\t\tSituação\n")
		escreva(nome1+"\t\t"+nota1+"\t\t"+resultado1+"\n")
		escreva(nome2+"\t\t"+nota2+"\t\t"+resultado2+"\n")
		escreva(nome3+"\t\t"+nota3+"\t\t"+resultado3+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */