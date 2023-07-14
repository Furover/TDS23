/* Gustavo Henrique - 09 - Empresa
 * Joao pedro - 12 - Conta corrente
 * Joao Martinez - 15 - Estudantil
 * Mateus Nezzi - 19 - Especial
 * Vinicius Souza - 26 - Poupanca
 */

package app;

import java.util.Scanner;

import entities.Corrente;
import entities.Empresa;
import entities.Especial;
import entities.Estudantil;
import entities.Poupanca;

public class AppConta {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Poupanca p1 = new Poupanca(1, "1111111", 10);
		Corrente c1 = new Corrente (1, "1111111", 3);
		Empresa e1 = new Empresa (1, "111111");
		Especial es1 = new Especial (1, "111111",1000);
		Estudantil est1 = new Estudantil (1, "111111", 1000);
		
	
		
		int res;
		String r = "";
		int ani;
		System.out.println("FOMY BANK");
		System.out.println("FOME DE DINHEIRO!");
		System.out.println(" ");
		System.out.println("1 - Conta Poupança ");
		System.out.println("2 - Conta Corrente ");
		System.out.println("3 - Conta Especial ");
		System.out.println("4 - Conta Empresa ");
		System.out.println("5 - Conta Estundatil ");
		System.out.println("6 - Sair ");
		System.out.print("Qual vc quer?????: ");
		res = input.nextInt();
		if (res == 1) {
			p1.ativar();
			System.out.println("FOMY BANK");
			System.out.println("FOME DE DINHEIRO!");
			System.out.println(" ");
			System.out.println("Conta poupança");
			System.out.println("Saldo atual :"+p1.getSaldo());
			System.out.println("Movimento : D - Debito, C - Credito");
			r = input.next().toUpperCase();
			for(int i = 1; i <= 10; i++) {
				if(r.equals("D")){
					if (p1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						p1.credito(input.nextDouble());
					}else {
						System.out.println("Valor para debitar: ");
						p1.debito(input.nextDouble());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					p1.credito(input.nextDouble());
				}
				if(i <= 10) {
				System.out.println("Saldo atual :"+p1.getSaldo());
				System.out.println("Movimento : D - Debito, C - Credito");
				r = input.next().toUpperCase().toUpperCase();
				}
			}
			System.out.println("Qual o dia de hj?:  ");
			ani = input.nextInt();
			p1.correcao(ani);
			System.out.println(p1.getSaldo());
		}
		if (res == 2) {
			boolean corrente = false;
			System.out.println("FOMY BANK");
			System.out.println("FOME DE DINHEIRO!");
			System.out.println(" ");
			c1.ativar();
			System.out.println("Conta poupança");
			for(int i = 1; i <= 10; i++) {
				if(i <= 10) {
					System.out.println("Saldo atual :"+c1.getSaldo());
					System.out.println("Movimento : D - Debito, C - Credito, SAIR - Sair");
					r = input.next().toUpperCase();
					}
				if(r.equals("D")){
					if (c1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						c1.credito(input.nextDouble());
					}else {
						System.out.println("Valor para debitar: ");
						c1.debito(input.nextDouble());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					c1.credito(input.nextDouble());
				}
				else if(r.equals("SAIR")) {
					System.out.println(c1.getSaldo());
					System.out.println("Vc quer uns cheques, meu mano?");
					r = input.next().toUpperCase();
						if(r.equals("S"))
						{
							System.out.println("Quantos cheques você quer? (Até 3)");
							c1.pediTalao(input.nextInt());
							System.out.println("Obrigado, até a próxima");
							corrente = true;
							break;
						}
						else if(r.equals("N")) {
							System.out.println("Obrigado, até a próxima");
							break;
						}	
				}
			}
			if(corrente == false) {
			System.out.println(c1.getSaldo());
			System.out.println("Vc quer uns cheques, meu mano?");
			r = input.next().toUpperCase();
				if(r.equals("S"))
				{
					System.out.println("Quantos cheques você quer? (Até 3)");
					c1.pediTalao(input.nextInt());
					System.out.println("Obrigado, até a próxima");
				
				}
				else if(r.equals("N")) {
					System.out.println("Obrigado, até a próxima");
				
				}
			}
				
				
		}
		System.out.println("Saldo atual :"+c1.getSaldo());

			
		
		if (res == 3) {
			System.out.println("FOMY BANK");
			System.out.println("FOME DE DINHEIRO!");
			System.out.println(" ");
			es1.ativar();
			System.out.println("Conta poupança");
			System.out.println("Saldo atual :"+es1.getSaldo()+"\nLimite: "+es1.getLimite());
			System.out.println("Movimento : D - Debito, C - Credito");
			r = input.next().toUpperCase();
			for(int i = 1; i <= 10; i++) {
				if(r.equals("D")){
					System.out.println("Quanto deseja debitar?");
					es1.debito(input.nextDouble());				
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					es1.credito(input.nextDouble());
				}
				System.out.println("Saldo atual :"+es1.getSaldo()+"\nLimite: "+es1.getLimite());
				System.out.println("Movimento : D - Debito, C - Credito");
				r = input.next().toUpperCase();
			}
		}
		if (res == 4) {
			System.out.println("FOMY BANK");
			System.out.println("FOME DE DINHEIRO!");
			System.out.println(" ");
			e1.ativar();
			System.out.println("Conta poupança");
			System.out.println("Saldo atual :"+e1.getSaldo());
			System.out.println("Movimento : D - Debito, C - Credito, E - Emprestimo");
			r = input.next().toUpperCase();
			for(int i = 1; i <= 10; i++) {
				if(r.equals("D")){
					if (e1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						e1.credito(input.nextDouble());
					}else {
						System.out.println("Valor para debitar: ");
						e1.debito(input.nextDouble());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					e1.credito(input.nextDouble());
				}else if (r.equals("E")) {
					System.out.println("Qual o valor do emprestimo?: ");
					e1.pedirEmprestimo(input.nextDouble());
				}
				System.out.println("Saldo atual :"+e1.getSaldo()+" Limite atual: "+ e1.getLimiteEmprestimo());
				System.out.println("Movimento : D - Debito, C - Credito, E - Emprestimo");
				r = input.next().toUpperCase();
			}
		}
		if (res == 5) {
			System.out.println("FOMY BANK");
			System.out.println("FOME DE DINHEIRO!");
			System.out.println(" ");
			p1.ativar();
			System.out.println("Conta Estudantil");
			System.out.println("Saldo atual :"+p1.getSaldo());
			System.out.println("Movimento : D - Debito, C - Credito, E - Estudantil");
			r = input.next().toUpperCase();
			for(int i = 1; i <= 10; i++) {
				if(r.equals("D")){
					if (est1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito: ");
						est1.credito(input.nextDouble());
					}else {
						System.out.println("Valor para debitar: ");
						est1.debito(input.nextDouble());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					est1.credito(input.nextDouble());
				}else if (r.equals("E")) {
					System.out.println("Qual o valor do emprestimo?: ");
					est1.usarEstudantil(input.nextDouble());
				}
				System.out.println("Saldo atual :"+est1.getSaldo()+" Limite atual: "+ est1.getLimiteEstudantil());
				System.out.println("Movimento : D - Debito, C - Credito, E - Emprestimo");
				r = input.next().toUpperCase();
			}
		}
	
		
	}

}
