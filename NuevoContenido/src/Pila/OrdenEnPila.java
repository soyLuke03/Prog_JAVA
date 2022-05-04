package Pila;

import java.util.ArrayList;
import java.util.List;

public class OrdenEnPila {

	List<Integer> numero = new ArrayList<>();
	
	
	public OrdenEnPila() {
		
	}
	
	public Integer pop() throws Exception {
		if(!numero.isEmpty()) {
			Integer n = numero.get(numero.size()-1);
			numero.remove(numero.size()-1);
			return n;
		}
		else {
			return null;
		}
		
		
	}
	
	public void push(Integer n) {
		numero.add(n);
	}

	@Override
	public String toString() {
		return "OrdenEnPila [numero=" + numero + "]";
	}

	public Integer size() {
		
		return numero.size();
	}
	
}
