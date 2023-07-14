package entities;

public class Terceiro extends funcionario{
	private String codEmpresa;
	private double diferencialSalario;
	public Terceiro(String nome, String matricula, double valorHora, int horasTrabalhadas, String codEmpresa, double diferencialSalario) {
		super(nome, matricula, valorHora, horasTrabalhadas);
		this.codEmpresa = codEmpresa;
		this.diferencialSalario = diferencialSalario;
	}
	public Terceiro(String matricula, String nome, String codEmpresa, double diferencialSalario, double valorHora, int horasTrabalhadas) {
		super(matricula, nome);
		this.codEmpresa = codEmpresa;
		this.diferencialSalario = diferencialSalario;
	}
	public Terceiro() {
		
	}
	@Override
	public double retornarSalario() {
		return ((super.getHorasTrabalhadas() * super.getValorHora()) + this.diferencialSalario);
	}
	public String getNomeEmpresaTerceiro() {
		return codEmpresa;
	}
	public void setNomeEmpresaTerceiro(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public double getDiferencialSalario() {
		return diferencialSalario;
	}
	public void setDiferencialSalario(double diferencialSalario) {
		this.diferencialSalario = diferencialSalario;
	}
	@Override
	public String toString() {
		return "Terceiro [codEmpresa=" + codEmpresa + ", diferencialSalario=" + diferencialSalario
				+ ", retornarSalario()=" + retornarSalario() + ", getMatricula()=" + getMatricula()
				+ ", getValorHora()=" + getValorHora() + ", getNome()=" + getNome() + "]";
	}
	
	
	
}
