package entities;

public class Produto {
	public String codigo, descricao;
	public double valorUnitario;
	public int estoque;
	
	public void incluirEstoque(int qtde) {
		this.estoque += qtde;
	}
	public void tirarEstoque(int qtde) {
		if(qtde < 0) {
			System.out.println("ERRO!!!");
		}
		else {
			if(qtde > this.estoque) {
				System.out.println("ERRO!!!");
			}
			else {
				this.estoque -= qtde;
				System.out.println("deu certo :)");
			}
		}
	}
}
