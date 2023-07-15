package entities;

public class Corrente extends Conta {
	
	//Feito pelo joao melara
	
	
	private int contadorTalao = 3;
	
	public Corrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	public int getContadorTalao() {
		return contadorTalao;
	}
	public void pediTalao(int quantTalao) {
		if(quantTalao <= contadorTalao && quantTalao>0) {
		this.contadorTalao =- quantTalao;
		this.debito(30.00 * quantTalao);
		double x = this.getSaldo();
		if(x<0) {
		this.credito(30.00 * quantTalao);
		System.out.println("Você não possui crédito suficiente");
		}
		
		}
		else {
			System.out.println("Digite um valor válido");
		}
	}

}
