programa
{
	
	funcao inicio()
	{	
			inteiro a = 0
			inteiro t = 0
			inteiro m = 0
			inteiro rm = 0
			inteiro tr = 0
			cadeia r
			para(inteiro y = 1;y <= 6;y++)
			{
				escreva("Digite um número: ")
				leia(a)
				t += a
				se(a > m)
				{
					rm = 1
					m = a
					tr++
				}
				senao se(a == m)
				{
					rm++
				}
				escreva("Continuar?(S/N): ")
				leia(r)
				se(r == "N" ou r == "n" ou r =="nao" ou r == "Nao" ou r =="não" ou r =="Não" ou r == "Na" ou r == "Nã" ou r == "na" ou r == "nã")
				{
					pare
				}
				senao se(r != "S" e r != "s" e r !="sim" e r != "Sim" e r != "Si" e r != "si")
				{
					escreva("\nDigite uma resposta válida na próxima vez.\n\n")
					pare
				}
			}
			escreva("A soma de todos esses números é "+t)
			escreva(" e o maior foi "+m)
			escreva("\nO maior número repetiu "+rm+" vezes, ")
			escreva("sendo trocado "+tr+" vezes.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */