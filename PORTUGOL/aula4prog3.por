programa
{
	
	funcao inicio()
	{
		inteiro x = 0
		escreva("Digite um número de 2 a 9: ")
		leia(x)
		escreva("\n")
		se(x >= 2 e x <=9)
		{
			escreva("A tabuada de "+x+" é:\n\n")
			para(inteiro y = 1;y <= 10;y++)
			{
				escreva(x+" x "+y+" = "+y*x+"\n")
			
			}
		}
		senao
		{
			escreva("Digite um número válido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */