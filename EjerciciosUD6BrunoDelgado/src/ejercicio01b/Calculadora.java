package ejercicio01b;

public class Calculadora {

	public Calculadora() {
		
	}
	
	public int dividir(int num, int den) throws ArithmeticException {
		return num/den;
	}
	
	public double hacerRaizCuadrada(int num) {
		return Math.sqrt(num);
	}
}
