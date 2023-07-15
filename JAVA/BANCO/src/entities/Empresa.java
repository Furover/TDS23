package entities;

public class Empresa extends Conta {
	
	//Feito pelo Gustav
	
	private double emprestimoEmpresa;
	private double limiteEmprestimo = 10000.00;

	public Empresa(int numero, String cpf, int emprestimoEmpresa) {
		super(numero, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void pedirEmprestimo(double valorEmprestimo) {
		if (valorEmprestimo <= this.limiteEmprestimo && valorEmprestimo >= 0) {
			this.limiteEmprestimo = this.limiteEmprestimo - valorEmprestimo;
			credito(valorEmprestimo);
		}
		else{
			System.out.println("Valor Invalido.");
		}
		
		
	}
	
}
