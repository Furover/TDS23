programa
{
	
	funcao inicio()
	{
		cadeia times[4], resposta = ""
		inteiro totpontos[4]
		times[0] = "SPFC"
		times[1] = "SFC"
		times[2] = "SCCP"
		times[3] = "SEP"
		para(inteiro x = 1; x <= 3; x++)
		{
			para(inteiro y = 0; y <= 3; y++)
			{
				escreva("\nO time "+times[y]+" Ganhou(G), Empatou(E) ou Perdeu(P)?\n")
				leia(resposta)
				se(resposta == "G" ou resposta == "g")
				{
					totpontos[y] += 3
				}
				senao se(resposta == "E" ou resposta == "e")
				{
					totpontos[y] += 1
				}
				senao se(resposta == "P" ou resposta == "p")
				{
					totpontos[y] += 0
				}
				senao
				{
					escreva("\nPor favor, escreva corretamente.")
					resposta = "parou"
					pare
				}
			}
			se(resposta == "parou" ou resposta != "")
			{
				pare
			}
		}
		escreva("\nTime\t\tPontos\n")
		linhas(25)
		para(inteiro z = 0; z <= 3; z++)
		{
			escreva("\n"+times[z]+"\t\t"+totpontos[z])
			
		}
	}
	funcao linhas(inteiro tamanho)
	{
		para(inteiro h = 1; h <= tamanho; h++)
		escreva("-")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */