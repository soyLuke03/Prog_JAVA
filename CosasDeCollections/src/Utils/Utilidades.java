package Utils;

public class Utilidades {

	/**
	 * M�todo gen�rico que recibe un ARRAY de cualquier clase y
	 * lo devuelve de forma ordenada de forma inversa.
	 * Si el OBJETO o el ARRAY es NULL se devuelve el mismo objeto.
	 * Si est� vac�o, lo devuelve de nuvo.
	 * @param <T> Tipo gen�rico que puede usarse con cualquier objeto
	 * @param arrayOriginal array a invertir
	 * @return array invertido
	 */
	public static <T> T[] reverse(T[] arrayOriginal) {
		int contador = 0;
		T[] clone = arrayOriginal.clone();
		
		if(arrayOriginal !=null) {
		
			clone = arrayOriginal.clone();
			
			for (int i = arrayOriginal.length-1;i>=0;i--) {
				clone[contador] = arrayOriginal[i];
				contador++;
			}
		}
		
		return clone;
	}

}
