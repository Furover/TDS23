programa
{
	
	funcao inicio()
	{
		cadeia evento[24][31]
		cadeia parar = "N"
		enquanto(parar == "N" ou parar == "n")
		{
			inteiro dia = 0, hora = 0
			escreva("Digite o dia: ")
			leia(dia)
			dia -= 1
			se(dia <= -1 ou dia > 30)
			{
				escreva("\n\nDigite um dia válido\n")
				pare
			}
			escreva("Digite a hora: ")
			leia(hora)
			se(hora < 0 ou hora > 23)
			{
				escreva("\n\nDigite uma hora válida")
				pare
			}
			escreva("Qual será o evento?: ")
			leia(evento[hora][dia])
			escreva("Deseja parar?(S/N): ")
			leia(parar)
		}
		traco(29)
		escreva("\n\t Suas tarefas")
		traco(29)
		escreva("\n")
		para(inteiro linha = 0; linha <= 23; linha++)
		{
			para(inteiro coluna = 0; coluna <= 30; coluna++)
			{
				se(evento[linha][coluna] != "")
				{
					escreva("\n\nTerá um evento no dia "+(coluna+1)+" às "+linha+"h.")
				}
			}
		}
		escreva("\n")
		traco(29)
		escreva("\nE é isso! :3")
		traco(29)
		escreva("\n\n")
	}
	funcao traco(inteiro tamanho)
	{
		escreva("\n")
		para(inteiro y = 0; y <= tamanho; y++)
		{
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {evento, 6, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */