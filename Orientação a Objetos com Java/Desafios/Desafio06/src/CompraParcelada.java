
public class CompraParcelada extends Compra {
	
	private Integer qtdParcelas;
	private Double jurosMensal;
	
	public CompraParcelada(Double valor, Integer qtdParcelas, Double jurosMensal) {
		super(valor);
		this.qtdParcelas = qtdParcelas;
		this.jurosMensal = jurosMensal;	
	}
	
	public Double total() {
		return super.total() * Math.pow((1 + jurosMensal / 100), qtdParcelas);
	}
}
