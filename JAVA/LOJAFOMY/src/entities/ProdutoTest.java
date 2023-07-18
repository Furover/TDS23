package entities;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void testRemoveStock() {
		Produto p1 = new Produto("XXXX", "XXXXX", 10, 1 ,1 );
		p1.removeStock(1);
		Assertions.assertEquals(0,p1.getStock());
		p1.removeStock(-1);
		Assertions.assertEquals(0,p1.getStock());
		p1.removeStock(0);
		Assertions.assertEquals(0,p1.getStock());
	}

	@Test
	void testAddCart() {
		Produto p1 = new Produto("XXXX", "XXXXX", 10, 10 ,0 );
		p1.setCart(0);
		p1.addCart("10");
		Assertions.assertEquals(10,p1.getCart());
		p1.addCart("-10");
		Assertions.assertEquals(10,p1.getCart());
		p1.addCart("0");
		Assertions.assertEquals(10,p1.getCart());
		p1.addCart("a");
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
		Assertions.assertEquals(10,p1.getCart());
		
	}

}
