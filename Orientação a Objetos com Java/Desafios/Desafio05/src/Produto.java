
public class Produto {

	protected String nome;
	protected int codigo;
	protected double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	@Override
	public boolean equals(Object produto) {
		if (this.codigo == ((Produto) produto).getCodigo()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getCodigo();
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

}
