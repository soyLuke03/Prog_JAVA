package WordTest;

public class Word {

	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean esPalindromo(String palabraAComprobar) {
		boolean pali = palabraAComprobar!=null;
		
		if (pali) {
			int longitudPalabra = palabraAComprobar.length();
			
			for(int i =0;i<longitudPalabra/2;i++) {
				if(palabraAComprobar.charAt(i)!=palabraAComprobar.length()-i) {
					pali = false;
				}
			}
		}
		
		
		return pali;
		
	}
	
}
