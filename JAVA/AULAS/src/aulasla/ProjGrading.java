package aulasla;
import java.util.Scanner;

import aulasla.Jump;
import aulasla.Line;
import aulasla.Space;

public class ProjGrading {

	public static String Code[] = {"3278", "3277", "3317", "3274", "3269", "3316", "3272", "3319", "3266", "3332", "3330", "3262", "3275", "3280", "3337", "3263", "3281", "3339", "3264", "3340", "3321", "3276", "3318", "3268", "3282", "3343", "3258"};
	public static String Number[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
	public static String Name[] = {"André de Castro Cruz", "André Henrique Marfin Ferreira", "Daniel P. dos Santos Silva", "Danilo Rezende da Silva", "Gabriel dos Anjos Correia da Silva", "Gabriel Marinho Guimarães", "Giovanna de Oliveira Scaglione", "Guilherme Adonario dos Santos", "Gustavo Henrique Torres e Silva", "Isabelle Cristina Dias Soares", "João Felipe Sena Nascimento", "João Pedro Mota Melára", "João Victor Alves Messias", "João Victor Bueno Ramalho", "João Vitor Rodrigues Martinez", "Jonatas Ferreira da Silva Pereira", "Júlio Henrique Scalete dos Santos", "Marcus Nunes de Campos", "Mateus Nezzi Ribeiro", "Matheus Nunes de Campos", "Moises Alves Bonfin", "Paulo Silas da Silva Santos", "Renato da Graça Silva", "Rodrigo de Andrade Montanholli", "Tiago de Lima Penaforte", "Vinícius Souza Santos", "Vitor Cruz dos Santos"};
	public static int Abscence[] = new int[27];
	public static double Score1[] = new double[27];
	public static double Score2[] = new double[27];
	public static double fScore[] = new double[27];
	
	public static void main(String[] args) {
		
		String readitnow = "";
		Scanner wdyd = new Scanner(System.in);
		report();
		
		for(int x = 0; x <= 26; x++) {
			if(Code[x].equalsIgnoreCase(readitnow)) {
				System.out.println("SOCORRROOOOOO!");
				addGrades();
				break;
			
			}
			else if(x == 26) {
				System.out.println("I'm sorry, but I couldn't find it, type it again:");
				readitnow = wdyd.next();
				x = -1;
			}
		}
		
		
		

	}
	public static void report() {
		System.out.println("Code\t\tNumber\t       1st Grade\t   2nd Grade\t       Final Grade\t\tName");
		for(int y = 0; y <= 26; y++) {
			System.out.printf("\n%s\t\t%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s",Code[y],Number[y],Score1[y],Score2[y],fScore[y],Name[y]);
		}

	}
	public static void addGrades() {
		System.out.println("hello!");

	}

}
