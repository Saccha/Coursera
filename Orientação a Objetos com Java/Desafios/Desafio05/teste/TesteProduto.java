import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testProdutoIgual() {
		Produto p1 = new Produto("Bola de futebol azul", 1, 25.0);
		Produto p2 = new Produto("Bola de futebol azul", 1, 25.0);
		assertSame(p1.hashCode(), p2.hashCode());
		assertEquals(p1, p2);
	}

	@Test
	public void testProdutoDiferente() {
		Produto p1 = new Produto("Bola de futebol azul", 1, 25.0);
		Produto p2 = new Produto("Bola de futebol branca", 2, 25.0);
		assertNotSame(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1, p2);
	}

}
