package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EspecialTest {

	@Test
	void testCredito() {
		Especial es1 = new Especial(1,"1",1000);
		es1.credito(1000);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.credito(0);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.credito(-1);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.credito(2);
		Assertions.assertEquals(1002, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
	}
	
	@Test
	void testDebito() {
		Especial es1 = new Especial(1,"1",1000);
		es1.credito(1000);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.debito(0);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.debito(-1);
		Assertions.assertEquals(1000, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.debito(1000);
		Assertions.assertEquals(0, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.debito(1001);
		Assertions.assertEquals(0, es1.getSaldo());
		Assertions.assertEquals(1000, es1.getLimite());
		es1.debito(1000);
		Assertions.assertEquals(0, es1.getSaldo());
		Assertions.assertEquals(0, es1.getLimite());
	}

}
