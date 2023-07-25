package entities;

public class ProdutosNaturaisPremium extends ProdutosNaturais{
	private double adicionalPremium;
	
	public ProdutosNaturaisPremium() {
		
	}

	public ProdutosNaturaisPremium(String codigo, String nome, double valor, int estoque, double margemLucro,
			String tipoProduto, double adicionalPremium) {
		super(codigo, nome, valor, estoque, margemLucro, tipoProduto);
		this.adicionalPremium = adicionalPremium;
	}

	@Override
	public double valorCompra(int quantidade) {
		return ((getValor() * quantidade + ((getValor() *quantidade)*getMargemLucro())) + this.adicionalPremium);
	
	}

	@Override
	public String toString() {
		return  super.toString() + "\t\t" + adicionalPremium;
	}

	public double getAdicionalPremium() {
		return adicionalPremium;
	}

	public void setAdicionalPremium(double adicionalPremium) {
		this.adicionalPremium = adicionalPremium;
	}

}
