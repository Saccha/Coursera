import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPizzaria {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("[DEBUG] - In�cio testes...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("[DEBUG] - Fim testes...");
	}

	@Before
	public void setUp() throws Exception {
		Pizza.zerarRegistroIngredientes();
	}


	/**
	 * Fa�a os testes de unidade da classe Pizza e verifique se o valor da Pizza
	 * est� correto de acordo com a quantidade de ingredientes. Verifique tamb�m se
	 * o registro de ingredientes funcionou corretamente.
	 */
	@Test
	public void umIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		carrinho.addPizza(pizza);

		assertEquals(15, pizza.getPreco());

	}
	
	@Test
	public void doisIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");

		carrinho.addPizza(pizza);

		assertEquals(15, pizza.getPreco());

	}

	@Test
	public void tresIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");

		carrinho.addPizza(pizza);

		assertEquals(20, pizza.getPreco());

	}
	
	@Test
	public void quatroIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");

		carrinho.addPizza(pizza);

		assertEquals(20, pizza.getPreco());

	}

	@Test
	public void cincoIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");
		pizza.adicionaIngrediente("ingred5");

		carrinho.addPizza(pizza);

		assertEquals(20, pizza.getPreco());

	}

	@Test
	public void seisIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");
		pizza.adicionaIngrediente("ingred5");
		pizza.adicionaIngrediente("ingred6");

		carrinho.addPizza(pizza);

		assertEquals(23, pizza.getPreco());

	}

	/**
	 * Crie um m�todo est�tico na classe Pizza que zera o registro de ingredientes e
	 * invoque ele em um m�todo de inicializa��o ou finaliza��o na classe de testes.
	 */

	@SuppressWarnings("static-access")
	@Test
	public void zerarValorERegistrosIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("ingred1");
		carrinho.addPizza(pizza);

		Pizza.zerarRegistroIngredientes();

		assertEquals(0, pizza.getPreco());
		assertEquals("{}", pizza.getQtdCadaIngr());

	}

	
	/**
	 * Fa�a os testes da classe TestCarrinhoCompras, verificando se o pre�o das pizzas
	 * s�o somados corretamente.
	 */

	
	@Test
	public void precosPizzasCarrinhoDeCompraUmIngrediente() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		carrinho.addPizza(pizza);

		assertEquals(15, carrinho.getTotal());

	}
	
	@Test
	public void precosPizzasCarrinhoDeCompraDoisIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		carrinho.addPizza(pizza);

		assertEquals(15, carrinho.getTotal());

	}
	
	@Test
	public void precosPizzasCarrinhoDeCompraTresIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		carrinho.addPizza(pizza);

		assertEquals(20, carrinho.getTotal());

	}
	
	@Test
	public void precosPizzasCarrinhoDeCompraQuatroIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");
		carrinho.addPizza(pizza);

		assertEquals(20, carrinho.getTotal());

	}
	
	@Test
	public void precosPizzasCarrinhoDeCompraCincoIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");
		pizza.adicionaIngrediente("ingred5");
		carrinho.addPizza(pizza);

		assertEquals(20, carrinho.getTotal());

	}
	
	@Test
	public void precosPizzasCarrinhoDeCompraSeisIngredientes() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("ingred1");
		pizza.adicionaIngrediente("ingred2");
		pizza.adicionaIngrediente("ingred3");
		pizza.adicionaIngrediente("ingred4");
		pizza.adicionaIngrediente("ingred5");
		pizza.adicionaIngrediente("ingred6");
		carrinho.addPizza(pizza);

		assertEquals(23, carrinho.getTotal());

	}
	
	/**
	 * Fa�a os testes da classe TestCarrinhoCompras, verificando se ele impede a adi��o de uma pizza sem
	 * ingredientes.
	 */

	@Test
	public void pizzaSemIngredienteAdicionaIngredienteVazio() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("");
		
		assertEquals(false,carrinho.addPizza(pizza));
	

	}
	
	@Test
	public void pizzaSemIngredienteNaoAdicionaIngrediente() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();
		
		assertEquals(false,carrinho.addPizza(pizza));
	

	}
	
}