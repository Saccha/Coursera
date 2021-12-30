package Pacientes;

import java.text.DecimalFormat;

public class Paciente {

	private Double peso; 
	private Double altura; 
	private Double calculoIMC; 

	Paciente(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}


	public Double calcularIMC() {
		calculoIMC = (this.peso / (this.altura * this.altura));

		String df = new DecimalFormat("0.#").format(calculoIMC).replace(",", ".");

		return Double.parseDouble(df);
	}


	public String diagnostico() {

		if (calcularIMC() < 16) {
			return "Baixo peso muito grave. (IMC abaixo de 16 kg/m²)";

		} else if (calcularIMC() >= 16 && calcularIMC() < 16.99) {
			return "Baixo peso grave (IMC entre 16 e 16,99 kg/m²)";

		} else if (calcularIMC() >= 17 && calcularIMC() < 18.49) {
			return "Baixo peso (IMC entre 17 e 18,49 kg/m²)";

		} else if (calcularIMC() >= 18.50 && calcularIMC() < 24.99) {
			return "Peso normal (IMC entre 18,50 e 24,99 kg/m²)";

		} else if (calcularIMC() >= 25 && calcularIMC() < 29.99) {
			return "Sobrepeso (IMC entre 25 e 29,99 kg/m²)";

		} else if (calcularIMC() >= 30 && calcularIMC() < 34.99) {
			return "Obesidade grau I (IMC entre 30 e 34,99 kg/m²)";

		} else if (calcularIMC() >= 35 && calcularIMC() < 39.99) {
			return "Obesidade grau II (IMC entre 35 e 39,99 kg/m²)";

		} else {
			return "Obesidade grau III (IMC igual ou maior que 40 kg/m²)";
		}
	}

}