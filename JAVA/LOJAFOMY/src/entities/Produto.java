package entities;

public class Produto {
	
	private String code;
	private String prod;
	private double value;
	private int stock;
	private int cart;
	
	public void Produto(String code, String prod, double value, int stock, int cart) {
		this.code = code;
		this.prod = prod;
		this.value = value;
		this.stock = stock;
		this.cart = cart;
		
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
	

}
