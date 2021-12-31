import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testProdutoComTamanhoIgualECodigoIgual() {
		Produto p1 = new ProdutoComTamanho("Camisa azul", 1, 25.0, 1);
		Produto p2 = new ProdutoComTamanho("Camisa azul", 1, 25.0, 1);
		assertSame(p1.hashCode(), p2.hashCode());
		assertEquals(p1, p2);
	}

	@Test
	public void testProdutoComTamanhoIgualECodigoDiferente() {
		Produto p1 = new ProdutoComTamanho("Camisa azul", 1, 25.0, 1);
		Produto p2 = new ProdutoComTamanho("Camisa azul", 2, 20.0, 1);
		assertNotSame(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1, p2);
	}

	@Test
	public void testProdutoComTamanhoDiferenteECodigoIgual() {
		Produto p1 = new ProdutoComTamanho("Camisa azul P", 1, 25.0, 1);
		Produto p2 = new ProdutoComTamanho("Camisa azul M", 1, 20.0, 2);
		assertNotSame(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1, p2);
	}

	@Test
	public void testProdutoComTamanhoDiferenteECodigoDiferente() {
		Produto p1 = new ProdutoComTamanho("Camisa azul P", 1, 25.0, 1);
		Produto p2 = new ProdutoComTamanho("Camisa azul M", 2, 20.0, 2);
		assertNotSame(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1, p2);
	}

}
