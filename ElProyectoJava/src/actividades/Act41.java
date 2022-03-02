package actividades;

public class Act41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = " 12 33 ";
		String resultado1 = "";

		
		for(int i = cadena.length()-1; i>=0 ;i--) {
			
			resultado1 += cadena.charAt(i);
			
		}
		System.out.println(cadena.trim());
		System.out.println(resultado1.trim());

			
		}


}
