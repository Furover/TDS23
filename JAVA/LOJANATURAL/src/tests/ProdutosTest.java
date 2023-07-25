package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.ProdutosNaturais;

class ProdutosTest {

	@Test
	void testIncluirEstoque() {
		ProdutosNaturais p1 = new ProdutosNaturais("222", "creme facial de banana", 10.00, 10, 2, "creme facial");
		//p1.addStock(1);
		p1.incluirEstoque(1);
		Assertions.assertEquals(11,p1.getEstoque());
		p1.incluirEstoque(-1);
		Assertions.assertEquals(11,p1.getEstoque());
		p1.incluirEstoque(0);
		Assertions.assertEquals(11,p1.getEstoque());
	}

	@Test
	void testTirarEstoque() {
		ProdutosNaturais p1 = new ProdutosNaturais("222", "creme facial de banana", 10.00, 10, 2, "creme facial");
		//p1.addStock(1);
		p1.tirarEstoque(1);
		Assertions.assertEquals(9,p1.getEstoque());
		p1.tirarEstoque(-1);
		Assertions.assertEquals(9,p1.getEstoque());
		p1.tirarEstoque(0);
		Assertions.assertEquals(9,p1.getEstoque());
	}

}
