package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b ,c, x;
		
		a=Leer.datoInt();
		b=Leer.datoInt();
		c=Leer.datoInt();
				
		CEcuacion2Grado ec = new CEcuacion2Grado(a, b ,c);
		
		x=Leer.datoInt();
		
		try {
			if(a==0&&b==0){
				throw new EcuacionException("fsdbhyfs");
			}
			if((Math.sqrt(Math.pow(b, 2))-4*a*c)<0) {
				
			}
			System.out.println(ec.formulaMas(x));
		}catch(EcuacionException e) {
			System.err.println(e.getMessage());
		}
	}

}
