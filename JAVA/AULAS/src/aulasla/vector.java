package aulasla;

import java.util.Locale;
import java.util.Scanner;

public class vector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner Read = new Scanner(System.in);
		String[] teams = new String[4];
		for(int x = 0; x <= 3; x++) {
			System.out.println("Type the teams name:");
			teams[x] = Read.nextLine();
		}
		System.out.println("The teams you have typed:");
		for(int x = 0; x <= 3; x++) {
			System.out.println(teams[x].toUpperCase());
			System.out.println("Amount of letters: "+teams[x].length());
		}
	}

}
