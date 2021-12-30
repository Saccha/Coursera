
public class Principal {

	public static void main(String[] args) {
CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muçarela");
		carrinho.addPizza(pizza1);
		
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("ovo");
		pizza2.adicionaIngrediente("cebola");
		carrinho.addPizza(pizza2); 



		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("molho de tomate");
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("alho torrado");
		pizza3.adicionaIngrediente("tomate");
		pizza3.adicionaIngrediente("orêgano");
		pizza3.adicionaIngrediente("alho");
		carrinho.addPizza(pizza3);

		Pizza pizzaSemIngredientes = new Pizza();
		pizzaSemIngredientes.adicionaIngrediente("");
		carrinho.addPizza(pizzaSemIngredientes);


		System.out.println("Total ingredientes do pedido: " + Pizza.getQtdCadaIngr());

		System.out.println("Valor total do pedido: R$" + carrinho.getTotal());
		
		
	}

}
