package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.AppLoja;

public class Produto {
	

	public List <Produto> list = new ArrayList<>();
	private String code;
	private String prod;
	private double value;
	private int stock;
	private int cart;
	
	public Produto(String code, String prod, double value, int stock, int cart) {
		this.code = code;
		this.prod = prod;
		this.value = value;
		this.stock = stock;
		this.cart = cart;
		
	}
	public Produto() {
		
	}
	
	public void addCart(int qty) {
		Scanner retry = new Scanner(System.in);
		if(qty <= 0 || qty > this.getStock()) {
			System.out.println("Valor inválido, digite novamente!");
			addCart(retry.nextInt());
		}
		else {
			this.cart += qty;
		}
	}
	public void removeCart(int qty) {
		Scanner retry = new Scanner(System.in);
		if(qty <= 0 || qty > this.getStock()) {
			System.out.println("Valor inválido, digite novamente!");
			removeCart(retry.nextInt());
		}
		else {
			this.cart -= qty;
		}
	}
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
			for(Produto x : list) {
				System.out.println(x.toString());
			}
			AppLoja.Lines(75);
		}
		else {
			for(Produto x : list) {
				System.out.println(x.toString());
			}
		}
	}
	public void declareTheOnes() {
		list.add(new Produto("GRP0X-01", "BONÉ             ", 100.00, 10, 0));
		list.add(new Produto("GRP0X-02", "CALÇA             ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-03", "BERMUDA         ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-04", "BATA             ", 140.00, 10, 0));
		list.add(new Produto("GRP0X-05", "CAMISA             ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-06", "SAIA RODADA        ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-07", "SAIA STYLE       ", 90.00, 10, 0));
		list.add(new Produto("GRP0X-08", "MACACÃO AFRO    ", 150.00, 10, 0));
		list.add(new Produto("GRP0X-09", "CAMISETA TEMATICA", 100.00, 10, 0));
		list.add(new Produto("GRP0X-10", "CALÇA SOCIAL AFRO", 95.50, 10, 0));
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCart() {
		return cart;
	}

	public void setCart(int cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return code + "\t" + prod + "\t" + value + "\t" + stock + "\t\t" + cart;
	}
	public String toStringCart() {
		return code + "\t" + prod + "\t" + value + "\t" + cart;
	}
	

}
