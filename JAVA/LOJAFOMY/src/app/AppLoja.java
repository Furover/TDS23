package app;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Produto;

public class AppLoja {
	
	
	public static Produto lp = new Produto();
	public static double totalValue = 0.00;
	public static boolean foundIt = false;
	public static int option = 0;
	
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
				Opcoes();
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
		
		
	}
	private static void Receipt(){
	    {
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
	            }
	        }

	        if(option == 1)
	        {
	            System.out.printf("\n\nValor final a vista: R$ %.2f\n",(totalValue * 0.9));
	            Lines(75);
	        }
	        else if(option == 2)
	        {
	            System.out.printf("\n\nValor final com cartão: R$ %.2f\n",(totalValue * 1.1));
	            Lines(75);
	        }
	        else if(option == 3)
	        {
	            double parcela1 = ((totalValue / 2) * 1.15);
	            double parcela2 = (parcela1 * 1.15);
	            System.out.printf("\nPARCELA 1: %.2f\nPARCELA 2: %.2f\nTOTAL: %.2f\n",parcela1,parcela2,(parcela1 + parcela2));
	            Lines(75);
	        }
	    Jump(1);
	    System.out.println("Obrigado por comprar C:");
	    lp.buying();
	    try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Jump(300);
	    firstScreen();
	    
	    }
	}
	public static void Opcoes() {
		Scanner read = new Scanner(System.in);
		String answer;
		boolean wrong = false;
		System.out.printf("\n\nOPÇÕES DE PAGAMENTO\n\n1 - A VISTA COM 10%% DESCONTO: %.2f",(totalValue * 0.9));
		System.out.printf("\n2 - NO CARTÃO COM 10%% DE JUROS: %.2f",(totalValue * 1.1));
		double parcela1 = ((totalValue / 2) * 1.15);
		double parcela2 = (parcela1 * 1.15);
		System.out.printf("\n3 - NO CARTÃO EM DUAS VEZES COM 15%% DE JUROS:");
		System.out.printf("\n    PARCELA 1: %.2f\n    PARCELA 2: %.2f\n    TOTAL: %.2f\n\n",parcela1,parcela2,(parcela1 + parcela2));
		System.out.println("Digite o número da opção que deseja utilizar:\n");
		LerOpcoes();
		while(wrong == false) {
			System.out.println("Deseja confirmar a compra?");
			answer = read.next().toUpperCase();
			if(answer.equals("S") || answer.equals("SIM")) {
				wrong = true;
				Receipt();
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
	
	public static void LerOpcoes() {
		Scanner read = new Scanner(System.in);
		try {
			option = read.nextInt();
	        if(option <= 0 || option >= 4)
	        {
	        	do
	        	{
	            	System.out.println("Escreve direito cara! >:(\n");
	            	option = read.nextInt();
	        	}
	        	while(option <= 0 || option >= 4);
	        }
		}
		catch(java.util.InputMismatchException inM) {
				System.out.println("Escreva um NÚMERO!!!11!");
				LerOpcoes();
		}
	}
	
	public static void Damn() {
		
	}
	
	
	public static void DecisionTime() {
		Scanner read = new Scanner(System.in);
		boolean wrong = true;
		String answer;
		int qty;
		foundIt = false;
		System.out.println("Qual o código do produto que deseja comprar?");
		answer = read.next().toUpperCase();
		while(foundIt == false) {
			int tries = -1;
			for(Produto x : lp.list) {
				tries++;
				if(answer.equals(x.getCode())  && x.getCart() > 0) {
					Jump(1);
					Lines(75);
					Jump(1);
					System.out.println(x.toString());
					Lines(75);
					Jump(1);
					System.out.println("Parece que você já colocou esse item em seu carrinho, o que deseja fazer com esse item?");
					Jump(1);
					while(wrong == true) {
						System.out.println("1 - Deseja adicionar mais no seu carrinho?");
						System.out.println("2 - Deseja remover uma quantidade do seu carrinho?");
						System.out.println("3 - Deseja voltar?");
						answer = read.next().toUpperCase();
						if(answer.equals("1")) {
							wrong = false;
							foundIt = true;
							System.out.println("Quanto deseja adicionar no seu carrinho?");
							System.out.println("(digite 0 para cancelar)");
							x.addCart(read.next());
							continueBuy();
							break;
						}
						else if(answer.equals("2")){
							wrong = false;
							foundIt = true;
							System.out.println("Quanto deseja remover do seu carrinho?");
							System.out.println("(digite 0 para cancelar)");
							x.removeCart(read.next());
							continueBuy();
							break;
						}
						else if(answer.equals("3")){
							wrong = false;
							foundIt = true;
							PrimaryScreen();
							break;
						}
						else {
							System.out.println("Aprenda a escrever!!!");
							Jump(1);
						}
					}
				
				}
				else if(answer.equals(x.getCode())) {
					Jump(1);
					Lines(75);
					Jump(1);
					System.out.println(x.toString());
					Lines(75);
					Jump(1);
					System.out.println("Quantos deseja desse item?");
					System.out.println("(digite 0 para cancelar)");
					try{x.addCart(read.next());}
					catch(java.util.InputMismatchException inM) {
						System.out.println("Escreva um NÚMERO!!!11!");
						x.addCart(read.next());
					}
					read.nextLine();
					continueBuy();
					break;
				
				}
				else if(tries == (lp.list.size() - 1)) {
					System.out.println("Não achei, escreva novamente:");
					answer = read.next().toUpperCase();
					tries = -1;
				}
			}
			
		}
		
	}
	
	public static void continueBuy() {
		Scanner read = new Scanner(System.in);
		boolean wrong = true;
		String answer;
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
				int cartHave = 0;
				for(Produto x : lp.list) {
					if(x.getCart() > 0) {
						cartHave++;
					}
				}
				if(cartHave == 0) {
					Jump(5);
					System.out.println("Você não tem nada no seu carrinho!!! Compre algo!");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					PrimaryScreen();
				}
				else {Cart();}
			}
			else {
				System.out.println("Aprenda a escrever!!!");
				Jump(1);
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
