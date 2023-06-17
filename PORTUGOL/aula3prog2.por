programa
{
	//Os passos servem para realizar os comandos um por um (o botão embaixo do executar)
	//=== serve para comparar dois números perfeitamente iguais, sendo positivo para (0 === 0) e seria falso para (0 === 0.00)
	funcao inicio()
	{
		cadeia nome
		inteiro ano, idade
		escreva("Escreva o seu nome: ")
		leia(nome)
		escreva("Escreva o ano em que nasceu: ")
		leia(ano)
		idade = 2023 - ano
		se(idade > 17)
		{
			escreva("Olá, "+nome+", sua idade aproximada é "+idade+" e você é considerade adulte")
		}
		senao
		{
			escreva("Olá, "+nome+", sua idade aproximada é "+idade+" e você é considerade jovem")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */