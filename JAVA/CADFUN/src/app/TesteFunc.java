package app;

import entities.Terceiro;
import entities.funcionario;

public class TesteFunc {

	public static void main(String[] args) {
		
		funcionario f1 = new funcionario("epaminondas", "matgamer", 20.00, 30);
		Terceiro t1 = new Terceiro("matgamer2", "guilherme", "2320523", 20, 20, 60);
		System.out.printf("Oi %s, seu salário é R$ %.2f",f1.getNome().toUpperCase(), f1.retornarSalario());
		f1.setNome("creuzo");
		f1.setHorasTrabalhadas(40);
		System.out.printf("\nOi %s, seu salário é R$ %.2f",f1.getNome().toUpperCase(), f1.retornarSalario());
		System.out.printf("\nOi %s, seu salário é R$ %.2f",t1.getNome(), t1.retornarSalario());
		System.out.println(f1);
		System.out.println(t1);
		
	}

}
