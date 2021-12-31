import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	CarrinhoDeCompras c;
	Produto bola;
	Produto prancha;
	Produto camisa1;
	Produto camisa2;
	Produto camisa3;
	Produto camisa4;

	@Before
	public void inicializaCarrinhoDeCompras() {
		c = new CarrinhoDeCompras();
		bola = new Produto("Bola de futebol", 1, 50.0);
		prancha = new Produto("Prancha de Surf", 2, 500.0);
		camisa1 = new ProdutoComTamanho("camisa azul clara P", 3, 25.0, 1);
		camisa2 = new ProdutoComTamanho("camisa azul escuro M", 4, 30.0, 2);
		camisa3 = new ProdutoComTamanho("camisa azul clara P", 3, 25.0, 1);
		camisa4 = new ProdutoComTamanho("camisa azul clara M", 3, 25.0, 2);
	}

	@Test
	public void testQuantidadeAdicionada() {
		c.adicionaProduto(bola, 1);
		c.adicionaProduto(prancha, 2);
		c.adicionaProduto(camisa1, 1);
		c.adicionaProduto(camisa2, 1);
		c.adicionaProduto(camisa3, 1);
		c.adicionaProduto(camisa4, 1);
		assertEquals(5, c.produtos.size());
	}

	@Test
	public void testQuantidadeAdicionadaComRemocao() {
		c.adicionaProduto(bola, 1);
		c.adicionaProduto(prancha, 2);
		c.adicionaProduto(camisa1, 1);
		c.adicionaProduto(camisa2, 2);
		c.adicionaProduto(camisa3, 2);
		c.adicionaProduto(camisa4, 1);
		c.removeProduto(camisa2, 1);
		c.removeProduto(camisa3, 1);
		assertEquals(5, c.produtos.size());
	}

	@Test
	public void testValorTotalDaCompra() {
		c.adicionaProduto(bola, 1);
		c.adicionaProduto(prancha, 2);
		c.adicionaProduto(camisa1, 1);
		assertEquals(1074.0, c.CalculaValorTotalDaCompra(), 3);
	}

}
