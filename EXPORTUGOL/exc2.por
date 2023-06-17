programa
{
	
	funcao inicio()
	{
		inteiro c = 0
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
			escreva("O operário "+c+" excedeu "+excesso+"h, e receberá "+(n * 10 + excesso * 20)+" R$ de salário neste mês, sendo"+excesso * 20+" R$ de salário excedente.")
		}
		senao
		{
			escreva("O operário "+c+" não teve hora extra, e receberá "+(n * 10 + excesso * 20)+" R$ de salário neste mês.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */