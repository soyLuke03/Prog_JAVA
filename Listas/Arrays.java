package Listas;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion boeing = new Avion("boeing12",120 );
		Avion avion2 = new Avion("avion2",150);
		
		
		Avion[] aeropuerto = new Avion[58];
		aeropuerto[2]=boeing;
		aeropuerto[0]=avion2;
		
		
		aeropuerto[1] = new Avion("PacoRyanAir",250);
		
		int[] arrayNumeros = new int[100];
		arrayNumeros[3]=15;

		
		System.out.println("0");
		
	}

}
