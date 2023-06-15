programa
{
	inclua biblioteca Matematica
  funcao inicio()
  {
    inteiro teste
    real testeraiz
    escreva("Digite o número que será calculado ao cubo: ")
    leia(teste)
    teste = Matematica.potencia(teste,3)
    escreva("Resultado: "+teste)
    testeraiz = Matematica.raiz(teste,2)
    escreva("\nRaiz quadrada: "+testeraiz)
  }
}