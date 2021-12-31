
public class ProdutoComTamanho extends Produto {

	private int tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object produto) {
		if (this.codigo == ((Produto) produto).getCodigo()
				&& this.tamanho == ((ProdutoComTamanho) produto).getTamanho()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return super.getCodigo() + this.getTamanho();
	}

	public int getTamanho() {
		return tamanho;
	}

}
