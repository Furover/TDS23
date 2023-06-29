package apps;

import java.util.Scanner;
import entities.Pessoa;

public class QuizPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		char op = ' ';
		System.out.println("Digite o nome da pessoa: ");
		p1.nome = leia.next();
		System.out.println("Digite o cpf da pessoa: ");
		p1.cpf = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		p1.anoNascimento = leia.nextInt();
		System.out.println("A pessoa está viva?");
		op = leia.next().toUpperCase().charAt(0);
		if(op == 'S') {
			p1.vivo = true;
		}
		else {
			p1.vivo = false;
		}
		System.out.println("Qual ano de referência(atual) :");
		p1.anoAtual = leia.nextInt();
		System.out.printf("Oi %s, sua idade aproximada é %d, e você está",p1.nome,p1.retornoNascimento(p1.anoNascimento));
		if(p1.vivo = true) {
			System.out.print(" vivo!!");
		}
		else {
			System.out.print(" morto :(");
		}
	}

}
