package Actividades2;

public class Ejerc1 {

	public static void main(String[] args) {
		
		devolucionCajero(970);	
	}


	public static void devolucionCajero(int importe) {
		
		int b500 = 1;
		int b200 = 5;
		int b100 = 3;
		int b50 = 0;
		int b20 = 1;
		int b10 = 1;
		int b5 = 12;
		
		
	while (importe >=5) {
		
		if (importe >= 500 && b500 >= 1) {
			b500 --;
			importe -= 500;
		}
		else if (importe >= 200 && b200 >=1) {
			b200--;
			importe -= 200;
		}
		else if (importe >= 100 && b100 >=1) {
			b100--;
			importe -= 100;
		}
		else if (importe >= 50 && b50 >=1) {
			b50--;
			importe -= 50;
		}
		else if (importe >= 20 && b20 >=1) {
			b20--;
			importe -= 20;
		}
		else if (importe >= 10 && b10 >=1) {
			b10--;
			importe -= 10;
		}
		else if (importe >= 5 && b5 >=1) {
			b5--;
			importe -= 5;
		}
		else {
			System.out.println("El importe denegado por falta de existencias");
			importe = 1;
		}
		
		
		
	}
	System.out.println("Se han entregado: " + b500+ " billetes de 500€");
	System.out.println("Se han entregado: " + b200+ " billetes de 200€");
	System.out.println("Se han entregado: " + b100+ " billetes de 100€");
	System.out.println("Se han entregado: " + b50+ " billetes de 50€");
	System.out.println("Se han entregado: " + b20+ " billetes de 20€");
	System.out.println("Se han entregado: " + b10+ " billetes de 10€");
	System.out.println("Se han entregado: " + b5+ " billetes de 5€");

		



	}
	


}

