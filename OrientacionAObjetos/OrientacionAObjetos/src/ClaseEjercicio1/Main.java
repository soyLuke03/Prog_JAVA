package ClaseEjercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	try {

		Rectangulo r1 = new Rectangulo(-1,2);
		
	}catch(RectException errorRectangulo) {
		System.out.println("Se ha producido una excepci�n: "+errorRectangulo.getMessage());
	}
	 
	 catch (Exception e) {
		 System.out.println("La excepci�n no se esperaba."+ e.getMessage());
	 }
	
	
		
		

	}


}
