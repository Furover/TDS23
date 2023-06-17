programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro peso = 0
		inteiro excedente = 0
		inteiro multa = 0
		escreva("Digite o peso do tomate em kilogramas:")
		leia(peso)
		excedente = peso - 50
		multa = excedente * 4
		se(peso > 50)
		{
			escreva("Você excedeu "+excedente+"kg do limite, e pagará "+multa+"R$ de multa.")
		}
		senao
		{
			escreva("Você excedeu "+excedente+"kg do limite, e pagará "+multa+"R$ de multa.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */