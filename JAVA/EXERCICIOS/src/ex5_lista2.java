import java.util.Scanner;

public class ex5_lista2 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o índice de pouluição atual?\n");
        double indice = input.nextDouble();

        if(indice<0.3 && indice >= 0.0)
        {
            System.out.print("O índice de poluição está dentre dos conformes ou próximo a eles, e não será necessário o fechamento de nenhum grupo");
        }
        else if(indice >= 0.3 && indice <0.4)
        {
            System.out.print("O índice de poluição está alto, e será necessário o fechamento do primeiro grupo");
        }
        else if(indice >= 0.4 && indice < 0.5)
        {
            System.out.print("O índice de poluição está alto, e será necessário o fechamento do primeiro e segundo grupo");
        }
        else if(indice >= 0.5)
        {
            System.out.print("O índice de poluição está alto, e será necessário o fechamento de todos os grupos (primeiro, segundo e terceiro)");
        }
        else
        {
            System.out.print("Escreva um número plausível");
        }
    }
}