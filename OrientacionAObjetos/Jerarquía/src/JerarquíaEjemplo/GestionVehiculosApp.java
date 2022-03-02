package JerarquíaEjemplo;

import java.util.Scanner;

public class GestionVehiculosApp {

	public static void main(String[] args) {
		
	
		menu();
	}

	public static void menu() {
		
		VehiculoPrueba[] almacen;
		
		System.out.println("Tipo de almacén: 1- Garaje 2- Hangar 3- Puerto");
		
		Scanner sc = new Scanner(System.in);
		
		int opcTipoAlmacen = Integer.valueOf(sc.nextLine());
		
		if(opcTipoAlmacen==1) {
			almacen = new TerrestrePrueba[10];
		}
		else if(opcTipoAlmacen==2){
			almacen= new AereoPrueba[5];
		}
		else {																												
			almacen = new AcuaticoPrueba[20];
		}
		
		almacen[0] = new Coche();
	}


}
