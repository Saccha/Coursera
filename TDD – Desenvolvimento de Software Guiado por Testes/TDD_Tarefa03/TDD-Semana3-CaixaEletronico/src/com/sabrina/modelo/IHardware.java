package com.sabrina.modelo;

public interface IHardware {

	/*
	 * para ler o n�mero da conta do cart�o para o login (retorna uma String com
	 * o n�mero da conta)
	 */
	public String pegarNumeroDaContaCartao(String numContaCorrente)
			throws ProblemaEncontradoCCException, HardwareException;

	/*
	 * entrega o dinheiro no caso do saque (retorna void)
	 */
	public void entregarDinheiro() throws HardwareException;

	/*
	 * recebe o envelope com dinheiro na opera��o de dep�sito (retorna void)
	 */
	public void lerEnvelope() throws HardwareException;
	
	public IServicoRemoto getServicoRemoto() throws HardwareException;
	
	public void setServicoRemoto(IServicoRemoto servicoRemoto) throws HardwareException;
}
