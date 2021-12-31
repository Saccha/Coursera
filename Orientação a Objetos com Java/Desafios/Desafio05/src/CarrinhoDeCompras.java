import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	Map<Produto, Integer> produtos = new HashMap<>();
	private double valorTotal = 0;

	public void adicionaProduto(Produto produto, int quantidade) {
		if (produtos.containsKey(produto)) {
			quantidade += produtos.get(produto);
			produtos.put(produto, quantidade);
		} else {
			produtos.put(produto, quantidade);
		}
		double preco = produtos.get(produto);
		valorTotal += (produto.preco * preco);

	}

	public void removeProduto(Produto produto, int quantidade) {
		if (produtos.containsKey(produto)) {
			quantidade -= produtos.get(produto);
			produtos.put(produto, quantidade);
			double preco = produtos.get(produto);
			valorTotal -= (produto.preco * preco);
		}
	}

	public double CalculaValorTotalDaCompra() {
		return valorTotal;

	}

}
