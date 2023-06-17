programa
{
	//Os passos servem para realizar os comandos um por um (o botão embaixo do executar)
	//=== serve para comparar dois números perfeitamente iguais, sendo positivo para (0 === 0) e seria falso para (0 === 0.00)
	funcao inicio()
	{
		inteiro a, b, c
		escreva("Digite o primeiro número a ser somado: ")
		leia(a)
		escreva("Digite o segundo número a ser somado: ")
		leia(b)
		c = a + b
		se(c % 2 == 0)
		{
			escreva("Resultado da soma: "+c+", que é par!")
		}
		senao
		{
			escreva("Resultado da soma: "+c+", que é impar!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */