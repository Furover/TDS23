programa
{
	
	funcao inicio()
	{
		real p = 0.00
		escreva("Digite o índice de poluição: ")
		leia(p)
		se(p >= 0.3 e p < 0.4)
		{
			escreva("Alto nível de poluição! As indústrias do grupo 1 devem suspender suas atividades.")
		}
		senao se(p >= 0.4 e p < 0.5)
		{
			escreva("Nível de poluição muito alto! As indústrias do grupo 1 e 2 devem suspender suas atividades.")
		}
		senao se(p >= 0.5)
		{
			escreva("Nível de poluição acima do limite! Todas as indústrias devem suspender suas atividades!")
		}
		senao se(p < 0.3 e p >= 0)
		{
			escreva("Nível de poluição aceitável, nenhuma ação necessária.")
		}
		senao
		{
			escreva("Digite um índice válido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */