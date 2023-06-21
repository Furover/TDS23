programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real sal = 0.00, salma = 0.00, saltot = 0.00, salmed = 0.00, sal100 = 0.00, filmed = 0.00,  filtot = 0.00
		inteiro fil = 0, p = 0
		escreva("Quantas pessoas serão entrevistadas?: ")
		leia(p)
		se(p < 0)
		{
			escreva("Digite um número válido")
		}
		para(inteiro x = 1; x <= p; x++)
		{
			escreva("\nDigite o salário: ")
			leia(sal)
			se(sal < 0)
			{
				escreva("Digite um valor válido")
				pare
			}
			se(sal > salma)
			{
				salma = sal
			}
			se(sal <= 100)
			{
				sal100++
			}
			saltot += sal
			escreva("\nDigite o número de filhos: ")
			leia(fil)
			se(fil < 0)
			{
				escreva("Digite um número válido")
				pare
			}
			filtot += fil
		}
		salmed = saltot / p
		filmed = filtot / p
		sal100 = (sal100 / p) * 100

		escreva("A média do salário da população é R$ "+Matematica.arredondar(salmed,2)+" e a média de filhos é "+Matematica.arredondar(filmed, 2)+", sendo o maior salário: "+salma)
		escreva("\nA porcentagem de pessoas com sálario até R$ 100 é "+Matematica.arredondar(sal100, 2)+"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {saltot, 7, 33, 6}-{salmed, 7, 48, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */