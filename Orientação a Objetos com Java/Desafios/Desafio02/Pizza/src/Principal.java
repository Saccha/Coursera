public class Principal {
	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Atum");
		p1.adicionaIngrediente("Frango");
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		System.out.println("Total de Pizzas: " + carrinhoDeCompras.totalPizzas());
		System.out.println("Preço Total: " + carrinhoDeCompras.getPrecoTotal());
		System.out.println("Ingredientes: " + Pizza.getListaIngredientes());
	}

}
