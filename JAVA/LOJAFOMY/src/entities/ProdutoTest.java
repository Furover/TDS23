package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Produto;

class ProdutoTest {

	@Test
	void testRemoveStock() {
		Produto p1 = new Produto("XXXX", "XXXXX", 10, 10 ,10);
		//p1.addStock(1);
		p1.removeStock(1);
		Assertions.assertEquals(9,p1.getStock());
		p1.removeStock(-1);
		Assertions.assertEquals(8,p1.getStock());
		p1.removeStock(0);
		Assertions.assertEquals(7,p1.getStock());
	}

	@Test
	void testAddCart() {
		Produto p1 = new Produto("XXXX", "XXXXX", 10, 10 ,0 );
		p1.setCart(0);
		p1.addCart("10");
		Assertions.assertEquals(10,p1.getCart());
		
	}

	@Test
	void testRemoveCart() {
		Produto p1 = new Produto("XXXX", "XXXXX", 10, 10 ,0 );
		p1.setCart(10);
		p1.removeCart("10");
		Assertions.assertEquals(0,p1.getCart());
		p1.setCart(10);
		p1.removeCart("0");
		Assertions.assertEquals(10,p1.getCart());
		p1.setCart(10);
		p1.removeCart("-10");
		Assertions.assertEquals(0,p1.getCart());
		
	}
	@Test 
	void testAddStock(){
		Produto p1 = new Produto("XXXX", "XXXXX", 0, 0 ,0 );
		p1.addStock(10);
		Assertions.assertEquals(10,p1.getStock());
		p1.addStock(0);
		Assertions.assertEquals(11,p1.getStock());
		p1.addStock(-1);
		Assertions.assertEquals(12,p1.getStock());
	}

}
