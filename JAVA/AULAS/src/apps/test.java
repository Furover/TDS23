package apps;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++;
        }

        sc.close();
    }
}
