package entities;

public class Terceiro extends funcionario{
	private String nomeEmpresaTerceiro;
	private double diferencialSalario;
	public Terceiro(String cpf, String nome, int anoNascimento, String matricula, String funcao, double valorHora,
			int horasTrabalhadas, String nomeEmpresaTerceiro, double diferencialSalario) {
		super(cpf, nome, anoNascimento, matricula, funcao, valorHora, horasTrabalhadas);
		this.nomeEmpresaTerceiro = nomeEmpresaTerceiro;
		this.diferencialSalario = diferencialSalario;
	}
	public String getNomeEmpresaTerceiro() {
		return nomeEmpresaTerceiro;
	}
	public void setNomeEmpresaTerceiro(String nomeEmpresaTerceiro) {
		this.nomeEmpresaTerceiro = nomeEmpresaTerceiro;
	}
	public double getDiferencialSalario() {
		return diferencialSalario;
	}
	public void setDiferencialSalario(double diferencialSalario) {
		this.diferencialSalario = diferencialSalario;
	}
	
	
}
