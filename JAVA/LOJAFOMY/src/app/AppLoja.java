package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ListaProduto;
import entities.Produto;

public class AppLoja {
	
	public static List <Produto> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		char answer;
		list.add(new Produto("GRP0X-01", "BONÉ             ", 100.00, 10, 0));
		list.add(new Produto("GRP0X-02", "CALÇA             ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-03", "BERMUDA         ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-04", "BATA             ", 140.00, 10, 0));
		list.add(new Produto("GRP0X-05", "CAMISA             ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-06", "SAIA RODADA        ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-07", "SAIA STYLE       ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-08", "MACACÃO AFRO    ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-09", "CAMISETA TEMATICA", 100.00, 10, 0));
		list.add(new Produto("GRP0X-10", "CALÇA SOCIAL AFRO", 95.50, 10, 0));
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
			System.out.println("BRUH, aprenda a escrever!!!");
			Jump(2);
			main(null);
			
		}
	
	
		
		
		

	}
	
	public static void PrimaryScreen() {
		ListaProduto lsp1 = new ListaProduto();
		Jump(300);
		lsp1.Lista(true);
		Jump(1);
		DecisionTime();
	}
	public static void Cart() {
		Scanner read = new Scanner(System.in);
		String answer;
		boolean wrong = true;
		double totalValue = 0;
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
		for(Produto x : list) {
			if(x.getCart() > 0) {
				System.out.println( x.toStringCart());
				totalValue += (x.getValue() * x.getCart());
			}
		}
		System.out.printf("\n\nValor total: R$ %.2f",totalValue);
		AppLoja.Lines(75);
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
		
		System.out.printf("\n\nOPÇÕES DE PAGAMENTO\n\n1 - A VISTA COM 10% DESCONTO: %.2f",(totalValue * 0.9));
		System.out.printf("\n2 - NO CARTÃO COM 10% DE JUROS: %.2f",(totalValue * 1.10));
		double parcela1 = ((totalValue / 2) * 1.15);
		double parcela2 = (parcela1 * 1.15);
		System.out.printf("\n3 - NO CARTÃO EM DUAS VEZES COM 15% DE JUROS:");
		System.out.printf("\nPARCELA 1: %.2f",parcela1,"\nPARCELA 2: %.2f",parcela2,"\nTOTAL: %.2f",(parcela1 + parcela2),"\n\n");
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
			for(Produto x : list) {
				tries++;
				if(answer.equals(x.getCode())) {
					Jump(1);
					Lines(75);
					Jump(1);
					System.out.println(x.toString());
					Lines(75);
					Jump(1);
					System.out.println("Quantos deseja desse item?");
					qty = read.nextInt();
					read.nextLine();
					while(wrong == true) {
						System.out.println("Deseja continuar comprando?");
						answer = read.next().toUpperCase();
						if(answer.equals("S") || answer.equals("SIM")) {
							wrong = false;
							foundIt = true;
							x.setCart(qty);
							PrimaryScreen();
						}
						else if(answer.equals("N") || answer.equals("NAO")){
							wrong = false;
							foundIt = true;
							x.setCart(qty);
							Cart();
						}
						else {
							System.out.println("Aprenda a escrever!!!");
							Jump(1);
						}
					}
				
				}
				else if(tries == (list.size() - 1)) {
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
