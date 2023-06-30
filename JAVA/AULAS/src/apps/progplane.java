package apps;

import java.util.Scanner;

import entities.watplane;

public class progplane {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		watplane t1 = new watplane("BIMOTOR","MEDIO");
		watplane t2 = new watplane(0, false, "AZUL", "BOEING", 2000);
		watplane t3 = new watplane();
		
		t1.ligarDesligar(1);
		System.out.println("Velocidade atual: "+t1.getVelocidade()+"km/h");
		System.out.println("Preparando para decolar...");
		for(int x = 1; x <= 20; x++) {
			t1.configurarVelocidade(1);
			System.out.println("Velocidade atual: "+t1.getVelocidade()+"km/h");
		}
		if(t1.getVelocidade() >= 200) {
			t1.decolar();
			
		}
		for(int x = 1; x <= 60; x++) {
			t1.configurarVelocidade(1);
			System.out.println("Velocidade atual: "+t1.getVelocidade()+"km/h");
		}
		t1.cruzeiro();
		System.out.println("Preparando para pousar...");
		for(int x = 1; x <= 60; x++) {
			t1.configurarVelocidade(-1);
			System.out.println("Velocidade atual: "+t1.getVelocidade()+"km/h");
		}
		t1.pousar();
		for(int x = 1; x <= 20; x++) {
			t1.configurarVelocidade(-1);
			System.out.println("Velocidade atual: "+t1.getVelocidade()+"km/h");
		}
		t1.ligarDesligar(-1);
		
	}

}
