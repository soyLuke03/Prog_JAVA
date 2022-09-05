package Files;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public  class Combinacion {
	
	
	
	
	public static final int VALOR_MINIMO = 0;
	public static final int VALOR_MAXIMO_NUMEROS = 50 +1;
	public static final int VALOR_MAXIMO_ESTRELLAS = 12 +1;
	public static final int TOTAL_NUMEROS = 5;
	public static final int TOTAL_ESTRELLAS = 2;
	
	private Collection<Integer> numeros = new HashSet<>();
	private Collection<Integer> estrellas = new HashSet<>();
	
	
	public Combinacion(int n1, int n2, int n3, int n4, int n5, int est1, int est2) {
		super();
		
		if(n1>VALOR_MINIMO&&n1<VALOR_MAXIMO_NUMEROS&&
		   n2>VALOR_MINIMO&&n2<VALOR_MAXIMO_NUMEROS&&
		   n3>VALOR_MINIMO&&n3<VALOR_MAXIMO_NUMEROS&&
		   n4>VALOR_MINIMO&&n4<VALOR_MAXIMO_NUMEROS&&
		   n5>VALOR_MINIMO&&n5<VALOR_MAXIMO_NUMEROS) {
			
			this.numeros.add(n1);
			this.numeros.add(n2);
			this.numeros.add(n3);
			this.numeros.add(n4);
			this.numeros.add(n5);
			
			if(est1>VALOR_MINIMO&&est1<VALOR_MAXIMO_ESTRELLAS&&
			   est2>VALOR_MINIMO&&est2<VALOR_MAXIMO_ESTRELLAS) {
				this.estrellas.add(est1);
				this.estrellas.add(est2);
			}
			
			
			
			if(numeros.size()!=TOTAL_NUMEROS||estrellas.size()!=TOTAL_ESTRELLAS) {
				throw new CombinacionException("[ERROR] Informacion invalida");
			}
			
		}
		else {
			throw new CombinacionException("[ERROR] Informacion invalida");
		}
		
	}
	
	
	public Combinacion(Collection<Integer> numeros, Collection<Integer> estrellas) {
		super();
		
		if(numeros.size()!=TOTAL_NUMEROS||estrellas.size()!=TOTAL_ESTRELLAS) {
			throw new CombinacionException("[ERROR] Informacion invalida");
		}
		else {
			this.numeros = numeros;
			this.estrellas = estrellas;
		}
		
	}

	
	
	
	
	
	//
	public String devolverNumeros() {
		StringBuilder sb = new StringBuilder();
		
		for(Integer i : numeros) {
			sb.append(i);
			sb.append("-");
		}
		
		return sb.toString();
	}
	//
	public String devolverEstrellas() {
		StringBuilder sb = new StringBuilder();
		
		for(Integer i : estrellas) {
			sb.append(i);
			sb.append("-");
		}
		
		return sb.toString();
	}
	//
	public String devolverCombinacion() {
		StringBuilder sb = new StringBuilder();
		
		
		for(Integer i : numeros) {
			sb.append(i);
			sb.append("-");
		}
		
		sb.append(" Estrellas:");
		
		for(Integer j : estrellas) {
			sb.append(j);
			sb.append("-");
		}
		
		return sb.toString();
	}
	
	
	
//	public abstract int comprobarCombinacion(Combinacion comb);
	
	/**
	 * Metodo para comprobar aciertos
	 * @param comb
	 * @return
	 */
	public int comprobarAciertos(Combinacion comb) {
		
		int aciertos = 0;
		
		for (Integer i : numeros) {
			if(comb.numeros.contains(i)) {
				aciertos +=1;
			}
		}
		
		for (Integer e : estrellas) {
			if(comb.estrellas.contains(e)) {
				aciertos +=1;
			}
		}
		
		return aciertos;
	}
	
	
	public Collection<Integer> getNumeros() {
		return numeros;
	}
	public Collection<Integer> getEstrellas() {
		return estrellas;
	}


	public void setNumeros(Collection<Integer> numeros) {
		this.numeros = numeros;
	}
	public void setEstrellas(Collection<Integer> estrellas) {
		this.estrellas = estrellas;
	}


	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}


	@Override
	public boolean equals(Object obj) {

		boolean	sonIguales = false;
		
		Combinacion otro = (Combinacion) obj;
		
		if(otro!=null) {
	
			if(otro==this) {
				sonIguales = true;
			}
			
			if(otro.numeros.equals(this.numeros) && otro.estrellas.equals(this.estrellas)) {
				sonIguales = true;
			}
			
		}
		
			
		return sonIguales;
	}


	@Override
	public String toString() {
		return "[numeros=" + numeros + ", estrellas=" + estrellas + "]";
	}


	
	
	
	
}
