package actividades;

public class Act43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena= "Hola Mundoso"; //SALIDA: "oHalm nuod"  // 0-1 2-3 4-5 6-7
		String salida= "";
		
		for (int i = 1; i < cadena.length() ; i += 2) {
			
				
				salida += cadena.charAt(i);
				salida += cadena.charAt(i-1);		
		}
		if (cadena.length() % 2 != 0) {
			salida += cadena.charAt(cadena.length()-1);
		}
		
		
		System.out.println(salida);
}
}
