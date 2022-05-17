package com.sabrina.mock;

import com.sabrina.modelo.ContaCorrente;
import com.sabrina.modelo.HardwareException;
import com.sabrina.modelo.IHardware;
import com.sabrina.modelo.IServicoRemoto;
import com.sabrina.modelo.ProblemaEncontradoCCException;

public class MockHardware implements IHardware{
	
	public IServicoRemoto servicoRemoto;
	
	public Boolean state;
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
	public MockHardware(MockServiceRemoto serviceRemoto) {
		servicoRemoto = serviceRemoto;
		state = true;
	}

	@Override
	public String pegarNumeroDaContaCartao(String numContaCorrente)
			throws ProblemaEncontradoCCException, HardwareException {
		if(!getState()) throw new HardwareException("Sistema indisponível, ao recuperar número da conta!");
		ContaCorrente cc = servicoRemoto.recuperarConta(numContaCorrente);
		return cc.getNumCC();
	}

	@Override
	public void entregarDinheiro() throws HardwareException {
		if(!getState()) throw new HardwareException("Sistema indisponível, ao entregar dinheiro!");		
	}

	@Override
	public void lerEnvelope() throws HardwareException {
		if(!getState()) throw new HardwareException("Sistema indisponível, ao ler envelope!");		
	}


	public IServicoRemoto getServicoRemoto(){
		return servicoRemoto;
	}

	public void setServicoRemoto(IServicoRemoto servicoRemoto){
		this.servicoRemoto = servicoRemoto;
	}

}
