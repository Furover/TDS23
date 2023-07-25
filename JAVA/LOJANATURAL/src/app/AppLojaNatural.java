package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;
import entities.ProdutosNaturais;
import entities.ProdutosNaturaisPremium;

public class AppLojaNatural {

	public static List <Produtos> lista = new ArrayList<>();
	public static String codigo;
	public static String nome;
	public static double valor;
	public static int estoque;
	public static double margemLucro;
	public static String tipoProduto;
	public static double adicionalPremium;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String resp;
		Space(8);
		System.out.print("A LOJA NATURAL");
		Jump(1);
		Lines(30);
		Jump(1);
		System.out.println("1 - INCLUIR PRODUTOS\n"
				+ "2 - ALTERAR DADOS PRODUTOS\n"
				+ "3 - EXCLUIR DADOS PRODUTOS\n"
				+ "4 - COMPRAR PRODUTOS\n"
				+ "5 - SAIR");
		Jump(1);
		System.out.print("Qual página deseja acessar?: ");
		resp = leia.next();
		if(resp.equals("1")) {
			IncluirProdutos();
		}
		else if(resp.equals("2")) {
			AlterarProdutos();
		}
		else if(resp.equals("3")) {
			ExcluirProdutos();
		}
		else if(resp.equals("4")) {
			ComprarProdutos();
		}
		else if(resp.equals("5")) {
			System.out.println("Obrigado por acessar o programa!");
		}
		else {
			System.out.println("Escreva novamente!");
			main(null);
		}

	}
	
	public static void IncluirProdutos(){
		Scanner leia = new Scanner(System.in);
		String resp;
		Lista();
		System.out.println("Qual o código do produto que deseja adicionar?");
		codigo = leia.next();
		System.out.println("Qual o nome do produto que deseja adicionar?");
		nome = leia.next();
		try {
			System.out.println("Qual o valor do produto que deseja adicionar?");
			valor = leia.nextDouble();
			System.out.println("Qual o estoque do produto que deseja adicionar?");
			estoque = leia.nextInt();
			System.out.println("Qual a margem de lucro do produto que deseja adicionar?");
			margemLucro = leia.nextDouble();
		}
		catch(java.util.InputMismatchException ex) {
			System.out.println("Você digitou o número errôneamente, voltando a tela principal...");
			Jump(2);
			main(null);
			return;
		}
		System.out.println("Qual o tipo do produto que deseja adicionar?");
		tipoProduto = leia.next();
		System.out.println("O produto que deseja adicionar é premium?");
		resp = leia.next().toLowerCase();
		if(resp.equals("sim") || resp.equals("s")) {
			try {
				System.out.println("Qual o valor adicional premium então?");
				adicionalPremium = leia.nextDouble();
			}
			catch(java.util.InputMismatchException ex) {
				System.out.println("Você digitou o número errôneamente, voltando a tela principal...");
				Jump(2);
				main(null);
				return;
			}
			lista.add(new ProdutosNaturaisPremium(codigo, nome, valor, estoque, margemLucro, tipoProduto, adicionalPremium));
			maisOutro(1);
		}
		else if(resp.equals("não") || resp.equals("n") || resp.equals("nao")) {
			lista.add(new ProdutosNaturais(codigo, nome, valor, estoque, margemLucro, tipoProduto));
			maisOutro(1);
		}
		else {
			System.out.println("Você digitou a resposta errôneamente, voltando a tela principal...");
			Jump(2);
			main(null);
			return;
		}
		
	}
	public static void AlterarProdutos(){
		Scanner leia = new Scanner(System.in);
		String resp;
		int qty;
		Lista();
		System.out.println("Qual o código do produto deseja alterar?");
		resp = leia.next();
		int y = 0;
		for(Produtos x : lista) {
			y++;
			if(resp.equals(x.getCodigo())){
				System.out.println("Valor\t\tEstoque\t\tLucro\t\tCódigo\t\tNome\t\tTipo\t\tPremium");
				System.out.println(x.toString());
				System.out.println("Deseja adicionar quantos?: ");
				qty = leia.nextInt();
				if(qty > 0) {
					x.incluirEstoque(qty);
					Jump(1);
					maisOutro(2);
					break;
				}
				else {
					System.out.println("Erro! Voltando a tela principal");
					main(null);
					break;
				}
			}
			
		}
		if(y == lista.size()) {
			System.out.println("Não encontrei! Voltando a tela principal");
			Jump(2);
			main(null);
			return;
		}
	}
	public static void ExcluirProdutos(){
		Scanner leia = new Scanner(System.in);
		String resp;
		int qty;
		Lista();
		System.out.println("Qual o código do produto deseja remover?");
		resp = leia.next();
		int y = 0;
		for(Produtos x : lista) {
			y++;
			if(resp.equals(x.getCodigo())){
				System.out.println("Valor\t\tEstoque\t\tLucro\t\tCódigo\t\tNome\t\tTipo\t\tPremium");
				System.out.println(x.toString());
				System.out.println("Deseja remover quantos?: ");
				qty = leia.nextInt();
				if(qty > 0 && qty <= x.getEstoque()) {
					x.tirarEstoque(qty);
					Jump(1);
					maisOutro(3);
					break;
				}
				else {
					System.out.println("Erro! Voltando a tela principal");
					main(null);
					break;
				}
			}
			
		}
		if(y == lista.size()) {
			System.out.println("Não encontrei! Voltando a tela principal");
			Jump(2);
			main(null);
			return;
		}
	}
	public static void ComprarProdutos(){
		Scanner leia = new Scanner(System.in);
		String resp;
		int qty;
		Lista();
		System.out.println("Qual o código do produto deseja Comprar?");
		resp = leia.next();
		int y = 0;
		for(Produtos x : lista) {
			y++;
			if(resp.equals(x.getCodigo())){
				System.out.println("Valor\t\tEstoque\t\tLucro\t\tCódigo\t\tNome\t\tTipo\t\tPremium");
				System.out.println(x.toString());
				Jump(1);
				System.out.println("Deseja comprar quantos?: ");
				qty = leia.nextInt();
				if(qty > 0 && qty <= x.getEstoque()) {
					x.tirarEstoque(qty);
					Jump(3);
					Space(20);
					System.out.println("Recibo");
					Lines(105);
					Jump(1);
					System.out.println("Valor\t\tEstoque\t\tLucro\t\tCódigo\t\tNome\t\tTipo\t\tPremium");
						System.out.println(x.toString() +"\n\nQuantidade: "+qty+"\nValor da Compra: " +x.valorCompra(qty));
					Jump(1);
					Lines(105);
					Jump(1);
					maisOutro(4);
					break;
				}
				else {
					System.out.println("Erro! Voltando a tela principal");
					main(null);
					break;
				}
				
			}
			
		}
		if(y == lista.size()) {
			System.out.println("Não encontrei! Voltando a tela principal");
			Jump(2);
			main(null);
			return;
		}
	}
	
	public static void maisOutro(int tipo){
		Scanner leia = new Scanner(System.in);
		String resp;
		System.out.println("Deseja adicionar/alterar/remover/comprar mais outro?");
		resp = leia.next();
		Jump(1);
		if(resp.equals("sim") || resp.equals("s")) {
			if(tipo == 1) {
				System.out.println("Salvando e indo para tela de incluir...");
				IncluirProdutos();
				return;
			}
			else if(tipo == 2) {
				System.out.println("Salvando e indo para tela de alterar...");
				AlterarProdutos();
				return;
			}
			else if(tipo == 3) {
				System.out.println("Salvando e indo para tela de excluir...");
				ExcluirProdutos();
				return;
			}
			else if(tipo == 4) {
				System.out.println("Salvando e indo para tela de comprar...");
				ComprarProdutos();
				return;
			}
		}
		else if(resp.equals("não") || resp.equals("n") || resp.equals("nao")) {
			main(null);
			return;
		}
		else {
			System.out.println("Não entendi...");
			Jump(1);
			maisOutro(tipo);
			return;
		}
	}
	
	public static void Lista() {
		Jump(3);
		Space(20);
		System.out.println("Produtos");
		Lines(105);
		Jump(1);
		System.out.println("Valor\t\tEstoque\t\tLucro\t\tCódigo\t\tNome\t\tTipo\t\tPremium");
		for(Produtos x : lista) {
			System.out.println(x.toString());
		}
		Jump(1);
		Lines(105);
		Jump(1);
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
