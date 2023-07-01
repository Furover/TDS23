package app;

import entities.Pessoa;
import entities.Terceiro;
import entities.funcionario;

public class appCadastroClientes {

	public static void main(String[] args) {
		Pessoa c1 = new Pessoa("11111111111","Fabrício Sanches",1999);
		Pessoa c2 = new Pessoa();
		funcionario f1 = new funcionario();
		Terceiro t1 = new Terceiro("10320432042", "Gabaghoul", 2002, "matematica", "Gamer", 100, 60, "Brasilondes", 20);
		
		c2.insiraCredenciais("nome");
		c2.insiraCredenciais("cpf");
		c2.insiraCredenciais("cartao");
		c2.insiraCredenciais("endereco");
		c2.insiraCredenciais("anoNasc");
		c2.insiraCredenciais("pronomes");
		c2.printCredenciais("tudo");
		c2.mostrarIdade();
		c1.printCredenciais("nome");
		c1.printCredenciais("cpf");
		c1.printCredenciais("anoNasc");
		c1.mostrarIdade();

	}

}
