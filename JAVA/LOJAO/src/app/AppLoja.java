package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLoja {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		List <String> login = new ArrayList<>();
		String names[] = {"JOÃO", "MARIA", "PEDRO"};
		names[0] = "FILIPE";
		
		login.add("FILIPE");
		login.add("MARIA");
		login.add("PEDRO");
		login.add("CLAUDIO");
		login.add("ANTONIO");
		
		
		/*
		for(int x = 0;x < names.length; x++) {
			System.out.println(names[x]);
		}
		*/
		System.out.println("Lista original:\n");
		for(String epa : login) {
			System.out.println(epa);
			
		}
		login.add(1, "CARLA");
		System.out.println("\nLista nova:\n");
		for(String epa : login) {
			System.out.println(epa);
		}
		login.remove(3);
		System.out.println("\nLista mais nova:\n");
		for(String epa : login) {
			System.out.println(epa);
		}
		login.add(0,"EPAMINONDAS");

	}

}
