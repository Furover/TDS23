programa
{
	
	funcao inicio()
	{
		inteiro total = 0
		para(inteiro x = 1;x <= 100;x++)
		{
			escreva("o número "+x)
			se(x % 2 == 0)
			{
				escreva(" é par.\n")
				total += x
			}
			senao
			{
				escreva(" é impar.\n")
			}
		}
		escreva("A somatória dos números pares é: "+total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */