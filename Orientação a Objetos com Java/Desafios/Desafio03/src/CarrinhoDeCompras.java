import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Pizza> aListPizzas = new ArrayList<>();

	private int total = 0;

	public boolean addPizza(Pizza pizza) {
		if (Pizza.qtdIngred != 0) {
			aListPizzas.add(pizza);
			return true;
		} else {
			return false;
		}
	}


	public int getTotal() {
		for (int i = 0; i < aListPizzas.size(); i++) {
			total += aListPizzas.get(i).getPreco();
		}
		return total;
	}

}

