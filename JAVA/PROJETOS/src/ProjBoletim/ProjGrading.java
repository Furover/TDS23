package ProjBoletim;
import java.util.Scanner;

import ProjBoletim.Jump;
import ProjBoletim.Line;
import ProjBoletim.Space;

public class ProjGrading {

	public static int SelStudent = 0;
	public static boolean Graded1[] = new boolean[27];
	public static boolean Graded2[] = new boolean[27];
	public static boolean Graded[] = new boolean[27];
	public static boolean Abscented[] = new boolean[27];
	public static String Code[] = {"3278", "3277", "3317", "3274", "3269", "3316", "3272", "3319", "3266", "3332", "3330", "3262", "3275", "3280", "3337", "3263", "3281", "3339", "3264", "3340", "3321", "3276", "3318", "3268", "3282", "3343", "3258"};
	public static String Number[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
	public static String Name[] = {"André de Castro Cruz", "André Henrique Marfin Ferreira", "Daniel P. dos Santos Silva", "Danilo Rezende da Silva", "Gabriel dos Anjos Correia da Silva", "Gabriel Marinho Guimarães", "Giovanna de Oliveira Scaglione", "Guilherme Adonario dos Santos", "Gustavo Henrique Torres e Silva", "Isabelle Cristina Dias Soares", "João Felipe Sena Nascimento", "João Pedro Mota Melára", "João Victor Alves Messias", "João Victor Bueno Ramalho", "João Vitor Rodrigues Martinez", "Jonatas Ferreira da Silva Pereira", "Júlio Henrique Scalete dos Santos", "Marcus Nunes de Campos", "Mateus Nezzi Ribeiro", "Matheus Nunes de Campos", "Moises Alves Bonfin", "Paulo Silas da Silva Santos", "Renato da Graça Silva", "Rodrigo de Andrade Montanholli", "Tiago de Lima Penaforte", "Vinícius Souza Santos", "Vitor Cruz dos Santos"};
	public static int Abscence[] = new int[27];
	public static double Score1[] = new double[27];
	public static double Score2[] = new double[27];
	public static double fScore[] = new double[27];
	public static String Status[] = new String[27];
	public static String readitnow = "";
	
	public static void main(String[] args) {
		Scanner wdyd = new Scanner(System.in);
		report();
		System.out.println("\n\nType a student's code");
		readitnow = wdyd.next();
		search();
		
		
		
		

	}
	
	
	public static void report() {
		System.out.println("Code\t\tNumber\t\tAbscence\t1st Grade\t2nd Grade\tFinal Grade\tStatus\t\tName");
		for(int y = 0; y <= 26; y++) {
			if(Status[y] == null) {
				if(Score1[y] == 0.00 && Graded[y] == false || Score2[y] == 0.00 && Graded[y] == false) {
					System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\tNO DATA\t\tNO DATA\t\t%s",Code[y],Number[y],Abscence[y],Score1[y],Score2[y],Name[y]);
				}
				else {
					System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\tNO DATA\t\t%s",Code[y],Number[y],Abscence[y],Score1[y],Score2[y],fScore[y],Name[y]);
				}
			}
			else {
				
				if(Score1[y] == 0.00 && Graded[y] == false || Score2[y] == 0.00 && Graded[y] == false) {
					System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\tNO DATA\t\t%s\t\t%s",Code[y],Number[y],Abscence[y],Score1[y],Score2[y],Status[y],Name[y]);
				}
				else {
					System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\t\t%s",Code[y],Number[y],Abscence[y],Score1[y],Score2[y],fScore[y],Status[y],Name[y]);
				}
			}
		}

	}
	
	
	public static void changeValuesAbs() {
		int wAbs = 0;
		Scanner amntAbscence = new Scanner(System.in);
		System.out.println("\nHow many times has this student been abscent?");
		wAbs = amntAbscence.nextInt();
		if(Abscence[SelStudent] < 0) {
			System.out.println("\nError, type again\n");
			changeValuesAbs();
		}
		else if(Abscence[SelStudent] >= 40) {
			Abscence[SelStudent] = wAbs;
			Status[SelStudent] = "REC";
			Abscented[SelStudent] = true;
			Jump.main(35);
			search();
		}
		else {
			Abscence[SelStudent] = wAbs;
			Abscented[SelStudent] = true;
			search();
		}
	}
	
	public static void changeValuesGra1() {
		double wGrade1 = 0.00;
		Scanner grade = new Scanner(System.in);
		System.out.println("\n\nWhat was his first grade?");
		wGrade1 = grade.nextInt();
		if(wGrade1 < 0.00 || wGrade1 > 10.00) {
			System.out.println("\n\nError, type again.");
			changeValuesGra1();
		}
		else {
			if(Graded2[SelStudent] == true) {
				Graded1[SelStudent] = true;
				Graded[SelStudent] = true;
				Score1[SelStudent] = wGrade1;
				fScore[SelStudent] = (Score1[SelStudent] + Score2[SelStudent]) / 2;
				search();
			}
			else {
				Graded1[SelStudent] = true;
				Score1[SelStudent] = wGrade1;
				search();
			}
		}
	}
	public static void changeValuesGra2() {
		double wGrade2 = 0.00;
		Scanner grade = new Scanner(System.in);
		System.out.println("\n\nWhat was his second grade?");
		wGrade2 = grade.nextInt();
		if(wGrade2 < 0.00 || wGrade2 > 10.00) {
			System.out.println("\n\nError, type again.");
			changeValuesGra2();
		}
		else {
			if(Graded1[SelStudent] == true) {
				Graded2[SelStudent] = true;
				Graded[SelStudent] = true;
				Score2[SelStudent] = wGrade2;
				fScore[SelStudent] = (Score1[SelStudent] + Score2[SelStudent]) / 2;
				search();
			}
			else {
				Graded2[SelStudent] = true;
				Score2[SelStudent] = wGrade2;
				search();
			}
		}
		
	}
	public static void changeValuesGraAll() {
		double wGrade1 = 0.00;
		Scanner grade = new Scanner(System.in);
		System.out.println("\n\nWhat was his first grade?");
		wGrade1 = grade.nextInt();
		if(wGrade1 < 0.00 || wGrade1 > 10.00) {
			System.out.println("\n\nError, type again.");
			changeValuesGraAll();
		}
		else {
				Graded1[SelStudent] = true;
				Score1[SelStudent] = wGrade1;
			
		}
		double wGrade2 = 0.00;
		System.out.println("\n\nWhat was his second grade?");
		wGrade2 = grade.nextInt();
		if(wGrade2 < 0.00 || wGrade2 > 10.00) {
			System.out.println("\n\nError, type again.");
			changeValuesGra2();
		}
		else {
				Graded2[SelStudent] = true;
				Graded[SelStudent] = true;
				Score2[SelStudent] = wGrade2;
				fScore[SelStudent] = (Score1[SelStudent] + Score2[SelStudent]) / 2;
				if(fScore[SelStudent] < 6.00) {
					Status[SelStudent] = "REC";
				}
				search();
			
		}
		
	}
	public static void changeValuesGra() {
		int wGrade = 0;
		Scanner option = new Scanner(System.in);
		System.out.println("\nWhat grade do you want to change?");
		System.out.println("\n1 - 1st Grade?\n2 - 2nd Grade?\n3 - All\n4 - Go back");
		wGrade = option.nextInt();
		
		if(wGrade == 1) {
			changeValuesGra1();
		}
		if(wGrade == 2) {
			changeValuesGra2();
		}
		if(wGrade == 3) {
			changeValuesGraAll();
		}
		if(wGrade == 4) {
			Jump.main(35);
			search();
		}
		else {System.out.print("\nI'm sorry, but I couldn't understand, type again."); changeValuesGra();}

	}
	
	public static void search() {
		Scanner retry = new Scanner(System.in);
		for(int x = 0; x < Name.length; x++) {
			if(Code[x].equals(readitnow)) {
				SelStudent = x;
				if(Graded[x] == true && Abscented[x] == true) {
					if(fScore[x] < 6.00) {
						Status[x] = "REC";
					}
					else {
						if(Abscence[x] >=40) {
							Status[x] = "REC";
						}
						else {
							Status[x] = "APPROVD";
						}
						
					}
				}
				System.out.println("\nFound them!\n");
				System.out.println("Code\t\tNumber\t\tAbscence\t1st Grade\t2nd Grade\tFinal Grade\tStatus\t\tName");
				if(Status[x] == null) {
					if(Graded[x] == false) {
						System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\tNO DATA\t\tNO DATA\t\t%s",Code[x],Number[x],Abscence[x],Score1[x],Score2[x],Name[x]);
						wdywtd();
					}
					else {
						System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\tNO DATA\t\t%s",Code[x],Number[x],Abscence[x],Score1[x],Score2[x],fScore[x],Name[x]);
						wdywtd();
					}
					
				}
				else {
					System.out.printf("\n%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\t\t%s",Code[x],Number[x],Abscence[x],Score1[x],Score2[x],fScore[x],Status[x],Name[x]);
					wdywtd();
				}
			
			}
			else if(x == 26) {
				System.out.println("I'm sorry, but I couldn't find it, type it again:");
				readitnow = retry.next();
				x = -1;
			}
		}
		
		
	}
	public static void wdywtd() {
		int command = 0;
		Scanner comorRetry = new Scanner(System.in);
		System.out.println("\n\nWhat would you like to do?");
		System.out.println("\n1 - Add absence?\n2 - Add grades?\n3 - Go back");
		command = comorRetry.nextInt();
		if(command == 1) {
			changeValuesAbs();
		}
		if(command == 2) {
			changeValuesGra();
		}
		if(command == 3) {
			readitnow = null;
			Jump.main(35);
			main(null);
		}
		else {System.out.print("\nI'm sorry, but I couldn't understand, type again."); wdywtd();}
			
	}
		
}


