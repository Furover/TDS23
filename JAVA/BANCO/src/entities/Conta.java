package entities;

public abstract class Conta {
	private int numero = 0;
	private String cpf = " ";
	private double saldo = 0;
	private boolean ativo = false;
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public double getSaldo() {
		return saldo;
	}




	public boolean isAtivo() {
		return ativo;
	}




	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}




	public void ativar() {
		this.ativo = true;
	}
	public void debito(double saldoF) {
		if(saldoF > this.saldo) {
			System.out.println("Coloque um valor válido");
		}
		else {
			if(saldoF > 0) {
			this.saldo = this.saldo - saldoF;
			}
			else
			{
				System.out.println("Coloque um valor válido");
			}
			}
		}
	public void credito(double saldoF) {

		if(saldoF > 0) {
		this.saldo = this.saldo + saldoF;
		}
		else
		{
			System.out.println("Coloque um valor válido");
		}
	}
	
}