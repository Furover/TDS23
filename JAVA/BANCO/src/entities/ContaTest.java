package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	void testDebito() {
		Poupanca p1 = new Poupanca(1,"1",1);
		p1.ativar();
		p1.credito(100.00);
		p1.debito(0);
		Assertions.assertEquals(100.00, p1.getSaldo());
		p1.debito(-1);
		Assertions.assertEquals(100.00, p1.getSaldo());
		p1.debito(101);
		Assertions.assertEquals(100.00, p1.getSaldo());
		p1.debito(50);
		Assertions.assertEquals(50.00, p1.getSaldo());
	}

	@Test
	void testCredito() {
		Poupanca p1 = new Poupanca(1,"1",1);
		p1.ativar();
		p1.credito(0);
		Assertions.assertEquals(0.00, p1.getSaldo());
		p1.credito(-1);
		Assertions.assertEquals(0.00, p1.getSaldo());
		p1.credito(1);
		Assertions.assertEquals(1.00, p1.getSaldo());	
		
	}

}
