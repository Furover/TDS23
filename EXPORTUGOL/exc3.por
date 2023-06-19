programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a = 0.00
		real aq = 0.00
		real b = 0.00
		real bq = 0.00
		real c = 0.00
		real cq = 0.00
		real d = 0.00
		real dq = 0.00
		escreva("Escreva o primeiro número:")
		leia(a)
		escreva("Escreva o segundo número:")
		leia(b)
		escreva("Escreva o terceiro número:")
		leia(c)
		escreva("Escreva o quarto número:")
		leia(d)
		aq = Matematica.potencia(a, 2.00)
		bq = Matematica.potencia(b, 2.00)
		cq = Matematica.potencia(c, 2.00)
		dq = Matematica.potencia(d, 2.00)
		
		se(cq >= 1000)
		{
			escreva("O valor do quadrado do terceiro número excedeu ou equivaleu 1000, sendo o seu valor: "+cq)
		}
		senao
		{
			escreva("O valor do terceiro não atingiu 1000, o valor de todos os números digitados foi:\n"+a+"\n"+b+"\n"+c+"\n"+d+"\nE os seus quadrados foram:\n"+aq+"\n"+bq+"\n"+cq+"\n"+dq)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */