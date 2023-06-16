programa
{
	inclua biblioteca Calendario
	inclua biblioteca Matematica
	funcao inicio()
	{
		real seg
		real hora
		real min
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(seg)
		escreva("\nTempo em segundos: "+seg+"s")
		min = seg / 60
		hora = min / 60
		min = Matematica.arredondar(min, 3)
		hora = Matematica.arredondar(hora, 3)
		escreva("\nTempo em minutos: "+min+"min")
		escreva("\nTempo em horas: "+hora+"h")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */