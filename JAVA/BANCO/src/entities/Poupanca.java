package entities;

public class Poupanca extends Conta {
	
	//Feito pelo vinicius souza
	
	private int diaAniversarioPoupanca;
	
	public Poupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	public void correcao(int data) {
		if(getDiaAniversarioPoupanca() == data) {
			credito(super.getSaldo() * 0.005);
		}
	}
	
}