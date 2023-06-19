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
			escreva("Você excedeu "+excedente+"kg do limite, e pagará R$ "+multa+" de multa.")
		}
		senao se (peso <= 50 e peso > 0)
		{
			excedente = 0
			multa = 0
			escreva("Você excedeu "+excedente+"kg do limite, e pagará R$ "+multa+" de multa.")
		}
		senao
		{
			escreva("Digite um número válido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */