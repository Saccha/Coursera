import static org.junit.Assert.*;

import org.junit.Test;

public class TestesTratamento {

	@Test
	public void testInformal() {
		Autoridade a = new Autoridade("Paulo", "Santos", "Informal");
		assertEquals("Paulo", a.getTratamento());
	}
	
	@Test
	public void testRespeitosoMasculino() {
		Autoridade a = new Autoridade("Ricardo", "Malias", "Respeitoso", "masculino");
		assertEquals("Sr. Malias", a.getTratamento());
	}
	
	@Test
	public void testRespeitosoFeminino() {
		Autoridade a = new Autoridade("Alice", "Costa", "Respeitoso", "feminino");
		assertEquals("Sra. Costa", a.getTratamento());
	}
	
	@Test
	public void testComTitulo() {
		Autoridade a = new Autoridade("Louise", "Aguiar", "ComTitulo", "feminino", "Mestre");
		assertEquals("Mestre Louise Aguiar", a.getTratamento());
	}

}
