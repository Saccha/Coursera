package com.sabrina.modelo;

public interface IServicoRemoto {
	
	public ContaCorrente recuperarConta(String numContaCorrente) throws ProblemaEncontradoCCException;
	//grava altera��es, como uma mudan�a no saldo devido a um saque ou dep�sito
	//deve ser chamado somente no caso de ser feito moviment��es com sucesso
	public void persistirConta(ContaCorrente contaCorrente); 

}
