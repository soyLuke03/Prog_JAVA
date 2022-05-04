package Paquete1;

import java.io.File;

import ficheros.Metadata;

public class Main {

	public static void main(String[] args) throws Exception {

		File fichero = new File("C:\\Users\\antog\\Desktop\\CarpetaEjercicio");
		
//		fichero.mkdir();
//		String n;
//		String m;
//		for(int i=0;i<=50;i++) {
//		n = String.valueOf(i);
//		fichero = new File("C:\\Users\\antog\\Desktop\\CarpetaEjercicio\\Carpeta"+n);
//		fichero.mkdir();
//			for(int j=0;j<2;j++) {
//			m = String.valueOf(j);
//			fichero = new File("C:\\Users\\antog\\Desktop\\CarpetaEjercicio\\Carpeta"+n+"\\"+m);
//				fichero.mkdir();
//			}
//		}
		
		
		Metadata md = new Metadata("C:\\Users\\antog\\Desktop\\CarpetaEjercicio");
		md.mostrarData("C:\\Users\\antog\\Desktop\\CarpetaEjercicio");

		
		}
		
	
	public static void crearEstructuraConDirectorios(String ruta, String nombre) {
		
		File raiz = new File(ruta);
		if(raiz.exists()&&raiz.canWrite()) {
			File directorioPrincipal = new File(ruta+"\\"+nombre);
			directorioPrincipal.mkdir();
			
			for(int i=1;i<51;i++) {
				File subcarpeta = new File(directorioPrincipal.getAbsolutePath()+"\\"+i);
				subcarpeta.mkdir();
				
				new File(subcarpeta.getAbsolutePath()+"\\subcarpeta1");
				new File(subcarpeta.getAbsolutePath()+"\\subcarpeta2");

			}
		}
		
	}
	
	
	}


