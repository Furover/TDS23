programa
{
	
	funcao inicio()
	{
		cadeia c
		inteiro n = 0
		inteiro excesso = 0
		escreva("Digite o código do operário:")
		leia(c)
		escreva("Digite o número de horas trabalhadas:")
		leia(n)
		se(n > 50)
		{
			excesso = n - 50
			n = n - excesso
			escreva("O operário "+c+" excedeu "+excesso+"h, e receberá R$ "+(n * 10 + excesso * 20)+" de salário neste mês, sendo R$ "+excesso * 20+" de salário excedente.")
		}
		senao se(n <= 50 e n >= 0)
		{
			escreva("O operário "+c+" não teve hora extra, e receberá R$ "+(n * 10 + excesso * 20)+" de salário neste mês, sendo R$ "+excesso * 20+" de salário excedente.")
		}
		senao
		{
			escreva("Digite um número válido de horas.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */