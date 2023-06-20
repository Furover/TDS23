programa
{
	
	funcao inicio()
	{	
			inteiro total = 0
			para(inteiro y = 1;y <= 100;y++)
			{
				se(y % 7 == 0 e y % 2 != 0)
				{
					escreva(y+"\n")
					total += y
				}
			}
			escreva("A soma de todos esses números é: "+total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */