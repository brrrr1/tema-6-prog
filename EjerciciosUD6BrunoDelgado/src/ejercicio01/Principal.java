package ejercicio01;

import utilidades.Leer;

public class Principal {
	/*
	 * 1) Realizar un programa que haga las operaciones básicas de una calculadora solo con números enteros (sumar,
resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones que se pueden producir
(entrada de datos, división por cero, raíz de un número negativo, etc.)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		
		int eleccion;
		
		do {
			System.out.println("""
					1) Sumar
					2) Restar
					3) Multiplicar
					4) Dividir
					5) Raíz cuadrada
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			case 1:
				try {
					System.out.println("Diga primer número");
					num1=Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2=Leer.datoInt();
					
					System.out.println(num1+num2);
				}catch(Exception e) {
					System.err.println("Por favor introduce 2 enteros.");
				}
				
				break;
			case 2:
				try {
					System.out.println("Diga primer número");
					num1=Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2=Leer.datoInt();
					
					System.out.println(num1-num2);
				}catch(Exception e) {
					System.err.println("Por favor introduce 2 enteros.");
				}
				
				break;
			case 3:
				try {
					System.out.println("Diga primer número");
					num1=Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2=Leer.datoInt();
					
					System.out.println(num1*num2);
				}catch(Exception e) {
					System.err.println("Has introducido un número con decimales. Por favor introduce 2 enteros.");
				}
				
				break;
			case 4:
				try {
					System.out.println("Diga primer número");
					num1=Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2=Leer.datoInt();
					
					System.out.println(num1/num2);
				}catch(Exception e) {
					System.err.println("Has introducido un número con decimales o dividido entre 0. Payaso.");
				}
				
				break;
				
			case 5:
				try {
					System.out.println("Diga número para hacer raíz cuadrado");
					num1=Leer.datoInt();
					
					System.out.println(Math.sqrt(num1));
				}catch(Exception e) {
					System.err.println("Has introducido un número negativo.");
				}
				
				break;
			case 0:
				System.out.println("Adiós");
			}
		}while(eleccion!=0);
	}

}
