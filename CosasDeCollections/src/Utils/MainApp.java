package Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] listaEnteros = new Integer[3];
		
		listaEnteros[0]=1;
		listaEnteros[1]=3;
		listaEnteros[2]=5;
		
		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		
		for (int i = 0;i<invertida.length;i++) {
			System.out.println(invertida[i]);
		}
		
		
		
	}

}
