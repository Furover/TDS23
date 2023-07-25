package entities;

public class ProdutosNaturais extends Produtos{
	private String tipoProduto;
	
	public ProdutosNaturais() {
		
	}
	public ProdutosNaturais(String codigo, String nome, double valor, int estoque, double margemLucro,
			String tipoProduto) {
		super(codigo, nome, valor, estoque, margemLucro);
		this.tipoProduto = tipoProduto;
	}

	@Override
	public String toString() {
		return super.toString() + "\t\t" + tipoProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
}
