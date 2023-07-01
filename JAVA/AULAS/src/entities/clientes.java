package entities;

import java.util.Scanner;

public class clientes {
	private String cpf, nome, pronomes;
	private int numCartao;
	private String endereco;
	private String dataNascimento;
	private int anoNascimento;
	private int anoAtual = 2023;
	private int idade;
	
	public clientes() {
		
	}
	public clientes(String cpf, String nome, int anoNascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	public int retornoIdade(int anoAtual) {
		return (anoAtual - this.anoNascimento);
		
	}
	public void mostrarIdade(int anoAtual) {
		System.out.println("a idade de "+this.nome+" é "+(anoAtual - this.anoNascimento));
	}
	public void insiraCredenciais(int tipo){
		Scanner read = new Scanner(System.in);
		if(tipo == 0) {
			System.out.println("Seu nome completo: ");
			this.nome = read.next();
		}
		if(tipo == 1) {
			System.out.println("Seu cpf: ");
			this.cpf = read.next();
		}
		if(tipo == 2) {
			System.out.println("Seu número do cartão: ");
			this.numCartao= read.nextInt();
		}
		if(tipo == 3) {
			System.out.println("Seu endereço: ");
			this.endereco = read.next();
		}
		if(tipo == 4) {
			System.out.println("Sua ano de nascimento: ");
			this.anoNascimento = read.nextInt();
		}
		if(tipo == 5) {
			System.out.println("Seus pronomes: ");
			this.pronomes = read.next();
		}
	}
	public void printCredenciais(int tipo){
		if(tipo == 0) {
			System.out.println("Seu nome completo: ");
			System.out.println(this.nome);
		}
		if(tipo == 1) {
			System.out.println("Seu cpf: ");
			System.out.println(this.cpf);
		}
		if(tipo == 2) {
			System.out.println("Seu número do cartão: ");
			System.out.println(this.numCartao);
		}
		if(tipo == 3) {
			System.out.println("Seu endereço: ");
			System.out.println(this.endereco);
		}
		if(tipo == 4) {
			System.out.println("Seu ano de nascimento: ");
			System.out.println(this.anoNascimento);
		}
		if(tipo == 5) {
			System.out.println("Seu nome completo: ");
			System.out.println(this.nome);
			System.out.println("Seu cpf: ");
			System.out.println(this.cpf);
			System.out.println("Seu número do cartão: ");
			System.out.println(this.numCartao);
			System.out.println("Seu endereço: ");
			System.out.println(this.endereco);
			System.out.println("Seu ano de nascimento: ");
			System.out.println(this.anoNascimento);
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPronomes() {
		return pronomes;
	}
	public void setPronomes(String pronomes) {
		this.pronomes = pronomes;
	}
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
