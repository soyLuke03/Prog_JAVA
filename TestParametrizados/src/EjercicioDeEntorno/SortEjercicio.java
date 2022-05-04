package EjercicioDeEntorno;

import java.util.ArrayList;
import java.util.List;

public class SortEjercicio {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(1);
		lista.add(15);
		lista.add(9);
		System.out.println(ordenarNumeros(lista));
		
	}
	
	public static List<Integer> ordenarNumeros(List<Integer> lista){ //[1, 4, 2, 5, 3, 8]
		
		List<Integer> listaOrdenada = new ArrayList<>();
		
		if(lista!=null && !lista.isEmpty()) {
			
			for(int i=0;i<lista.size();i++) {
				
				int posicionActual = i;
				boolean posicionEncontrada = false;
				
				while (!posicionEncontrada && posicionActual>0) {
					
					if(lista.get(posicionActual-1)>lista.get(posicionActual)) {
						
						Integer tmp = lista.get(posicionActual);
						lista.remove(posicionActual);
						lista.add(posicionActual-1,tmp);
						
						posicionActual--;
					}
					else {
						posicionEncontrada = true;
					}
					
				}
				
				
			}
		}
		
		
		
		return listaOrdenada;
	}
	
	
}
