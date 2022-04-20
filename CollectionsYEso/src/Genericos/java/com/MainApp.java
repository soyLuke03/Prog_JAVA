package Genericos.java.com;

public class MainApp {

	public static void main(String[] args) {
		
		Pareja<Integer> punto = new Pareja<>(11230,120);
		
		System.out.println(punto.getMenor());
	}
	
}
