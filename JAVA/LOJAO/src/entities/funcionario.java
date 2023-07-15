package entities;

public class funcionario {
	private String matricula;
	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	public funcionario(String nome, String matricula, double valorHora, int horasTrabalhadas) {
		this.nome = nome;
		this.matricula = matricula;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public funcionario(String matricula, String nome) {
	
		this.matricula = matricula;
	}
	public funcionario() {
		super();
	}
	public double retornarSalario() {
		return this.horasTrabalhadas * this.valorHora;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Enrollment: " + matricula + "\nName: " + nome + "\nMoney by hour: " + valorHora
				+ "\nHours worked: " + horasTrabalhadas + "\nSalary: R$ " + retornarSalario();
	}
	
	
	
	
}
