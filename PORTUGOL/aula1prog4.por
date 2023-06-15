programa
{
	funcao inicio()
	{
		cadeia nome
		real temp1
    real temp2
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em celsius: ")
		leia(temp1)
    temp2 = (temp1 * 1.8) + 32
		escreva("Olá, "+nome+", a temperatura aproximada em fahreinheit é: "+temp2)
	}