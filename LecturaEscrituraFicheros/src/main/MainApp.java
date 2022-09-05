package main;

public class MainApp {

	private static final String RUTA = "C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\LecturaEscrituraFicheros\\src\\main\\files\\archivo.txt";

	public static void main(String[] args) {
		
		Writer escritor = new Writer();
		Reader lector = new Reader();
		
		String txt = lector.lectorTXT(RUTA);
		System.out.println(txt);
		
		escritor.escritor(RUTA);
		
		System.out.println(txt);
		
	}
}
