package entities;

import app.AppLoja;

public class ListaProduto extends Produto{
	
	public void Lista(boolean slogan) {
		
		if(slogan == true) {
			AppLoja.Jump(300);
			AppLoja.Space(30);
			System.out.print("FOMY  STORE");
			AppLoja.Jump(1);
			AppLoja.Space(32);
			System.out.print("ALBERTO");
			AppLoja.Jump(1);
			AppLoja.Lines(75);
			AppLoja.Jump(2);
			System.out.println("Código\t\tProduto\t\t\tValor\tEstoque\t\tCarrinho");
			AppLoja.Lines(75);
			AppLoja.Jump(1);
			for(Produto x : AppLoja.list) {
				System.out.println(x.toString());
			}
			AppLoja.Lines(75);
		}
		else {
			for(Produto x : AppLoja.list) {
				System.out.println(x.toString());
			}
		}
	}
}
