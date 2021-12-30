import java.util.HashMap;

public class Pizza {
	static int qtdIngred = 0;

	static HashMap<String, Integer> hMapIngredientes = new HashMap<>();


	public void adicionaIngrediente(String ingrediente) {
		if (!ingrediente.isEmpty()) {
			Pizza.qtdIngred++;
			contablilizaIngrediente(ingrediente);
		} else {
		}

	}


	public int getPreco() {
		if (Pizza.qtdIngred == 0)
			return 0;
		else if (Pizza.qtdIngred >= 1 && Pizza.qtdIngred <= 2)
			return 15;
		else if (Pizza.qtdIngred >= 3 && Pizza.qtdIngred <= 5)
			return 20;
		else
			return 23;
	}

	

	private static void contablilizaIngrediente(String ingrediente) {

		if (hMapIngredientes.containsKey(ingrediente)) {
			hMapIngredientes.put(ingrediente, (hMapIngredientes.get(ingrediente)) + 1);
		

		} else
			hMapIngredientes.put(ingrediente, 1);
	}

	
	public static String getQtdCadaIngr() {
		
		return hMapIngredientes.toString();
		

	}
	
	
	public static void zerarRegistroIngredientes() {
		
		hMapIngredientes.clear();
		qtdIngred = 0;
	}
	
	
}
