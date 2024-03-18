package ejercicio01b;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c = new Calculadora();
		int eleccion;
		int num1, num2;
		boolean salida=false;
		
		do {
			System.out.println("""
					1) Dividir
					2) Raíz cuadrada
					""");
			eleccion=Leer.datoInt();
			switch(eleccion){
			case 1:
				num1=Leer.datoInt();
				num2=Leer.datoInt();
				try {
					System.out.println(c.dividir(num1, num2));
					salida=true;
				}catch(ArithmeticException e) {
					System.err.println("El denominador no puede ser cero");
				}catch(NumberFormatException e) {
					System.err.println("Introduce un número");				}
				break;
				
			case 2:
				num1=Leer.datoInt();
				try {
					System.out.println(c.hacerRaizCuadrada(num1));
				}catch(Exception e) {
					System.err.println("Error Inesperado");
				}

			}
		}while(!salida);			
	}

}
