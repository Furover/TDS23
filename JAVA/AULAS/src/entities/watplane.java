package entities;

import java.util.Scanner;

public class watplane {
	private int velocidade;
	private boolean ligado;
	private String porte;
	private String modelo;
	private String cor;
	private int anoFab;
	
	//CONSTRUCTORS
	public watplane() {
		
	}
	public watplane(String porte, String modelo){
		this.modelo = modelo;
		this.porte = porte;
		
	}
	public watplane(int velocidade, boolean ligado, String cor, String modelo, int anoFab) {
		this.velocidade = velocidade;
		this.ligado = ligado;
		this.cor = cor;
		this.modelo = modelo;
		this.anoFab = anoFab;
	}
	public watplane(int velocidade, boolean ligado, String porte, String modelo, String cor, int anoFab) {
		super();
		this.velocidade = velocidade;
		this.ligado = ligado;
		this.porte = porte;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFab = anoFab;
	}
	
	//CLASSES NORMAIS
	public void ligarDesligar(int func) {
		if(func > 0 && ligado == false) {
			System.out.println("Ligando avião...");
			this.ligado = true;
		}
		else if(func < 0 && ligado == true) {
			System.out.println("Desligando avião...");
			this.ligado = false;
		}
		else {
			System.out.println("Erro, digite o valor novamente de ligar!");
			Scanner retry = new Scanner(System.in);
			func = retry.nextInt();
			ligarDesligar(func);
		}
	}
	public void configurarVelocidade(int func){
		//aumenta ou diminui 10 em 10
		if(func > 0 && velocidade < 1000 && ligado == true) {
			this.velocidade += 10;
		}
		else if(func < 0 && velocidade > 0 && ligado == true) {
			this.velocidade -= 10;
		}
		else {
			System.out.println("Erro, digite o valor novamente da velocidade, ou ligue o avião!");
			Scanner retry = new Scanner(System.in);
			configurarVelocidade(retry.nextInt());
		}
		
	}
	public void decolar(){
		//acima de 200km/h
		if(this.velocidade >= 200) {
		System.out.println("Avião decolando...");
		}
		else {
			System.out.println("Aplique mais velocidade!");
			while(this.velocidade < 200) {
				configurarVelocidade(1);
			}
			decolar();
		}
	}
	public void pousar() {
		//abaixo de 200km/h
		if(this.velocidade <= 200) {
			System.out.println("Avião pousando...");
			}
			else {
				System.out.println("Dimunua mais a velocidade!");
				while(this.velocidade > 200) {
					configurarVelocidade(-1);
				}
				pousar();
			}
	}
	public void cruzeiro(){
		if(this.velocidade >= 800) {
			System.out.println("Avião em vôo de cruzeiro... acionando piloto automático");
			}
		else {
			System.out.println("Aumente mais a velocidade!");
			while(this.velocidade < 800) {
				configurarVelocidade(1);
			}
			cruzeiro();
		}
		
		
	}
	

	//ENCAPSULAMENTO - GETTERS AND SETTERS
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	
}
