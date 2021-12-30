package Pacientes;


public class PacienteMain {
public static void main(String[] args) {
		
		
	Paciente p1 = new Paciente(52.0, 1.81); 
	Paciente p2 = new Paciente(120.0, 1.81); 
	Paciente p3 = new Paciente(150.0, 1.81); 

	System.out.println("IMC: " + p1.calcularIMC() + " | Diagnóstico: " + p1.diagnostico());
	System.out.println("IMC: " + p2.calcularIMC() + " | Diagnóstico: " + p2.diagnostico());
	System.out.println("IMC: " + p3.calcularIMC() + " | Diagnóstico: " + p3.diagnostico());

	}

}
