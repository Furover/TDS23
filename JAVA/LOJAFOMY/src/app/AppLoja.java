package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Produto;

public class AppLoja {
	
	
	public static Produto lp = new Produto();
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		lp.declareTheOnes();
		
		firstScreen();
		
	}
	
	public static void firstScreen() {
		Scanner read = new Scanner(System.in);
		char answer;
		Space(10);
		System.out.print("FOMY  STORE");
		Jump(1);
		Space(12);
		System.out.print("ALBERTO");
		Jump(1);
		Lines(30);
		Jump(1);
		System.out.print("Deseja comprar conosco??!?: ");
		answer = read.next().toUpperCase().charAt(0);
		if(answer == 'S') {
			PrimaryScreen();
		}
		else if(answer == 'N') {
			System.out.println("Tchau tchau!!! :3");
		}
		else {
			Jump(300);
			System.out.println("Aprenda a escrever!!!");
			Jump(2);
			firstScreen();
			
		}
	}
	
	public static void PrimaryScreen() {
		Jump(300);
		lp.Lista(true);
		Jump(1);
		DecisionTime();
	}
	public static void Cart() {
		Scanner read = new Scanner(System.in);
		String answer;
		boolean wrong = true;
		double totalValue = 0.00;
		AppLoja.Jump(300);
		AppLoja.Space(30);
		System.out.print("FOMY  STORE");
		AppLoja.Jump(1);
		AppLoja.Space(32);
		System.out.print("ALBERTO");
		AppLoja.Jump(1);
		AppLoja.Lines(75);
		AppLoja.Jump(2);
		System.out.println("Código\t\tProduto\t\t\tValor\tQuantidade");
		AppLoja.Lines(75);
		AppLoja.Jump(1);
		for(Produto x : lp.list) {
			if(x.getCart() > 0) {
				System.out.println( x.toStringCart());
				totalValue += (x.getValue() * x.getCart());
			}
		}
		System.out.printf("\n\nValor total: R$ %.2f\n",totalValue);
		Lines(75);
		Jump(1);
		while(wrong == true) {
			System.out.println("Deseja confirmar a compra?");
			answer = read.next().toUpperCase();
			if(answer.equals("S") || answer.equals("SIM")) {
				wrong = false;
			}
			else if(answer.equals("N") || answer.equals("NAO")){
				wrong = false;
				Damn();
			}
			else {
				System.out.println("Aprenda a escrever!!!");
				Jump(1);
			}
		}
		double totalValue2 = 0.0;
		totalValue2 = (totalValue * 0.9);
		System.out.printf("\n\nOPÇÕES DE PAGAMENTO\n\n1 - A VISTA COM 10% DESCONTO: %f",totalValue2);
		totalValue2 = totalValue * 1.1;
		System.out.printf("\n2 - NO CARTÃO COM 10% DE JUROS: %.2f",totalValue2);
		double parcela1 = ((totalValue / 2) * 1.15);
		double parcela2 = (parcela1 * 1.15);
		totalValue2 = parcela1 + parcela2;
		System.out.printf("\n3 - NO CARTÃO EM DUAS VEZES COM 15% DE JUROS:");
		System.out.printf("\nPARCELA 1: %.2f",parcela1,"\nPARCELA 2: %.2f",parcela2,"\nTOTAL: %.2f",totalValue2,"\n\n");
		System.out.println("Digite o número da opção que deseja utilizar:\n");
		answer = read.next();
		while(wrong == false) {
			System.out.println("Deseja confirmar a compra?");
			answer = read.next().toUpperCase();
			if(answer.equals("S") || answer.equals("SIM")) {
				wrong = true;
			}
			else if(answer.equals("N") || answer.equals("NAO")){
				wrong = true;
				Damn();
			}
			else {
				System.out.println("Aprenda a escrever!!!");
				Jump(1);
			}
		}
		
		
	}
	
	public static void Damn() {
		
	}
	
	public static void DecisionTime() {
		Scanner read = new Scanner(System.in);
		boolean foundIt = false;
		boolean wrong = true;
		String answer;
		int qty;
		System.out.println("Qual o código do produto que deseja comprar?");
		answer = read.next().toUpperCase();
		while(foundIt == false) {
			int tries = -1;
			for(Produto x : lp.list) {
				tries++;
				if(answer.equals(x.getCode())) {
					Jump(1);
					Lines(75);
					Jump(1);
					System.out.println(x.toString());
					Lines(75);
					Jump(1);
					System.out.println("Quantos deseja desse item?");
					x.addCart(read.nextInt());
					read.nextLine();
					while(wrong == true) {
						System.out.println("Deseja continuar comprando?");
						answer = read.next().toUpperCase();
						if(answer.equals("S") || answer.equals("SIM")) {
							wrong = false;
							foundIt = true;
							PrimaryScreen();
						}
						else if(answer.equals("N") || answer.equals("NAO")){
							wrong = false;
							foundIt = true;
							Cart();
						}
						else {
							System.out.println("Aprenda a escrever!!!");
							Jump(1);
						}
					}
				
				}
				else if(tries == (lp.list.size() - 1)) {
					System.out.println("Não achei, escreva novamente:");
					answer = read.next().toUpperCase();
					tries = -1;
				}
			}
			
		}
		
	}
	
	
	public static void Lines(int qty) {
		for(int x = 1; x <= qty; x++) {
			System.out.print("-");
		}
	}
	public static void Jump(int qty) {
		for(int x = 1; x <= qty; x++) {
			System.out.print("\n");
		}
	}
	public static void Space(int qty) {
		for(int x = 1; x <= qty; x++) {
			System.out.print(" ");
		}
	}

}
