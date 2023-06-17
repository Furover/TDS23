programa
{
	//Os passos servem para realizar os comandos um por um (o botão embaixo do executar)
	//=== serve para comparar dois números perfeitamente iguais, sendo positivo para (0 === 0) e seria falso para (0 === 0.00)
	funcao inicio()
	{
		cadeia nome
		real salario
		escreva("Escreva o seu nome: ")
		leia(nome)
		escreva("Escreva o seu salário: ")
		leia(salario)
		se(salario <= 2500)
		{
			escreva("Olá "+nome+", você é isento de impostos")
		}
		se(salario >= 5000)
		{
			escreva("Olá "+nome+", você paga: "+(salario * 0.25)+" em impostos, que condiz a 25% do seu salário")
		}
		senao
		{
			escreva("Olá "+nome+", você paga: "+(salario * 0.15)+" em impostos, que condiz a 15% do seu salário")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */