import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testCompraUmaParcela() {
		CompraParcelada c = new CompraParcelada(100d, 1, 10d);
		assertEquals(110, c.total(), 0.01);
	}
	
	@Test
	public void testCompraDuasParcelas() {
		CompraParcelada c = new CompraParcelada(100d, 2, 10d);
		assertEquals(121, c.total(), 0.01);
	}
	
	@Test
	public void testCompraCincoParcelas() {
		CompraParcelada c = new CompraParcelada(100d, 5, 10d);
		assertEquals(161.05, c.total(), 0.01);
	}
	
	@Test
	public void testCompraDezParcelas() {
		CompraParcelada c = new CompraParcelada(100d, 10, 10d);
		assertEquals(259.37, c.total(), 0.01);
	}

}
