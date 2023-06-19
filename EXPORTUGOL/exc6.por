programa
{
	
	funcao inicio()
	{
		inteiro i
		escreva("Digite a idade do nadador:")
		leia(i)
		se(i >= 5 e i <= 7)
		{
			escreva("O nadador é da categoria Infantil A.")
		}
		senao se(i >= 8 e i <= 11)
		{
			escreva("O nadador é da categoria Infantil B.")
		}
		senao se(i >= 12 e i <= 13)
		{
			escreva("O nadador é da categoria Juvenil A.")
		}
		senao se(i >= 14 e i <= 17)
		{
			escreva("O nadador é da categoria Juvenil B.")
		}
		senao se(i >= 18)
		{
			escreva("O nadador é da categoria Adultos.")
		}
		senao se(i < 5 e i >= 0)
		{
			escreva("O nadador não está com a idade apropriada para ser classificado.")
		}
		senao
		{
			escreva("Digite uma idade válida.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */