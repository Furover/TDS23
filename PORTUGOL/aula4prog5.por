programa
{
	
	funcao inicio()
	{	
			inteiro a = 0
			inteiro t = 0
			inteiro m = -1000000000
			para(inteiro y = 1;y <= 5;y++)
			{
				escreva("Digite um número: ")
				leia(a)
				t += a
				se(a > m)
				{
					m = a
				}
			}
			escreva("A soma de todos esses números é: "+t)
			escreva(" e o maior foi: "+m)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */