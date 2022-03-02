package Actividades2;

public class Ejerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		triangulo(-3);
		
	}
	
	public static void triangulo(int numero) {
		
			int i;
			int iteracion=0; 

			if (numero>0) {
				
				for (i = 1; i <= numero; i++) {
					
					iteracion = 1;
					
				while (iteracion <= i) {
								System.out.print(i);
								iteracion++;

				}
					System.out.println("");
				}
				
			}
		
			
			else if (numero<0) {
				for(i=Math.abs(numero); i >= 1 ;i--) {
						
						
						iteracion = i;
						
						while(iteracion > 0) {
									System.out.print(i);
									iteracion--;

						}


						System.out.println("");
					    }

				
				
				
			

		}
	
}
}
