package entities;

public abstract class Produtos {
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	private double margemLucro;
	
	public Produtos() {
		
	}
	public Produtos(String codigo, String nome, double valor, int estoque, double margemLucro) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
		this.margemLucro = margemLucro;
	}
	
	public double valorCompra(int quantidade) {
			return (this.valor * quantidade + ((this.valor *quantidade)*this.margemLucro));
		
	}
	public void incluirEstoque(int quantidade) {
		if(quantidade > 0) {
			this.estoque += quantidade;
		}
		else {
			System.out.println("Valor inválido!");
		}
	}
	public void tirarEstoque(int quantidade) {
		if(quantidade > 0 && quantidade <= this.estoque) {
			this.estoque -= quantidade;
		}
		else {
			System.out.println("Valor inválido!");
		}
		
	}
	
	@Override
	public String toString() {
		return  valor + "\t\t" + estoque
				+ "\t\t" + margemLucro +"\t\t" + codigo + "\t\t" + nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	

}
