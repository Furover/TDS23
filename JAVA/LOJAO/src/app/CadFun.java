package app;

import java.util.ArrayList;
import java.util.List;

import entities.Terceiro;
import entities.funcionario;

public class CadFun {

	public static void main(String[] args) {
		
		List <funcionario> login = new ArrayList<>();
		login.add(new funcionario("EPAMINONDAS", "001", 10.00, 40));
		login.add(new Terceiro("MARIA","002",10.00,40,"XT01",10));
		
		for(funcionario x : login) {
			System.out.println(x.getNome()+" salario R$ "+x.retornarSalario());
		}
	}

}
