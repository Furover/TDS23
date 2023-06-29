package apps;

import java.util.Scanner;

import entities.Produto;

public class CadLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Produto qualquer = new Produto();
		
		qualquer.estoque = 10;
		
		qualquer.tirarEstoque(-1);
		
		System.out.println("Estoque atual "+qualquer.estoque);
	}

}
