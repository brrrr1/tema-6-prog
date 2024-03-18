package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperaturaC;
		double temperaturaF;
		
		System.out.println("Introduzca temperatura en grados Celsius");
		temperaturaC=Leer.datoDouble();
			
		try {
			if(temperaturaC<-273){
				throw new TemperaturaException("No puedes introducir temperaturas inferiores a -273ºC");
			}
			temperaturaF=temperaturaC*9/5+32;
			System.out.printf("Son %.2fºF",temperaturaF);
		}catch(TemperaturaException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}