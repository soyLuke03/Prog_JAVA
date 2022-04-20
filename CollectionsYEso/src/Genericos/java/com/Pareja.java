package Genericos.java.com;

public class Pareja<T> {

	private T elemento1;
	private T elemento2;
	
	public Pareja(){
		
	}
	
	public Pareja(T el1,T el2) {
		
		this.elemento1 = el1;
		this.elemento2 = el2;
	}

	@Override
	public String toString() {
		return "Pareja [elemento1=" + elemento1 + ", elemento2=" + elemento2 + "]";
	}
	
	public T getMenor() {
		T menor = null;
		
		if(elemento1!=null && elemento2!=null) {
			if(elemento1.hashCode()< elemento2.hashCode()) {
				menor = elemento1;
			}
			else {
				menor = elemento2;
			}
		}
		return menor;
	}
	
}
