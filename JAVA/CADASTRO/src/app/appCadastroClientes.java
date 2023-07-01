package app;

import entities.clientes;
import entities.funcionario;

public class appCadastroClientes {

	public static void main(String[] args) {
		clientes c1 = new clientes("11111111111","Fabrício Sanches",1999);
		clientes c2 = new clientes();
		funcionario f1 = new funcionario();
		
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
