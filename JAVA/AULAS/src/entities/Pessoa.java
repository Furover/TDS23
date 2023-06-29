package entities;

public class Pessoa {
	public String cpf, nome;
	public boolean vivo;
	public int anoNascimento;
	public int anoAtual = 2023;
	private int idade;
	
	public int retornoNascimento(int anoNascimento) {
		return (anoAtual - this.anoNascimento);
	}
	
	public void mostrarIdade() {
		System.out.println(this.nome+", sua idade é "+(anoAtual - this.anoNascimento));
	}

}
