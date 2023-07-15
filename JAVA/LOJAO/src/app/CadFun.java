package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Terceiro;
import entities.funcionario;

public class CadFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in); //instancing a list 
		
		List <funcionario> login = new ArrayList<>();
		//Employee
		String matricula;
		String nome;
		double valorHora;
		int horasTrabalhadas;
		//Third-party
		String codEmpresa;
		double diferencialSalario;
		int qty;
		char type;
		
		System.out.println("EMPLOYEE'S REGISTRE");
		System.out.println();
		System.out.print("How many employees will you register?: ");
		qty = read.nextInt();
		
		for(int x = 1; x <= qty; x++) {
			read.nextLine();
			System.out.print("Enrollment: ");
			matricula = read.next();
			System.out.print("Name: ");
			nome = read.next();
			System.out.print("Money by hour: R$ ");
			valorHora = read.nextDouble();
			System.out.print("Hours worked: ");
			horasTrabalhadas = read.nextInt();
			System.out.print("Is third-party(T/F)?: ");
			type = read.next().toUpperCase().charAt(0);
			if(type == 'T') {
				System.out.print("What's the code?: ");
				codEmpresa = read.next();
				System.out.print("Salary differential: ");
				diferencialSalario = read.nextDouble();
				login.add(new Terceiro(nome,matricula,valorHora,horasTrabalhadas,codEmpresa,diferencialSalario));
			}
			else if(type == 'F') {
				login.add(new funcionario(nome,matricula,valorHora,horasTrabalhadas));
			}
		}
		System.out.println("FOLHA DE PAGAMENTO");
		
		for(funcionario x : login) {
			System.out.println(x.toString());
		}
	}

}
