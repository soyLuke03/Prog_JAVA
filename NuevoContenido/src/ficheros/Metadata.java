package ficheros;

import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Metadata {

	String path;
	
	private boolean esdirectorio;
	private boolean esfichero;
	private LocalDate date;
	private boolean lectura;
	private boolean escritura;
	private boolean ejecucion;
	private String contenido;
	
	
	public Metadata(String path) {
		this.path=path;
	}
	
	public String mostrarData(String path) {
		
		File fichero = new File(this.path);
		
		if(fichero.isDirectory()&&fichero.exists()) {
			System.out.println("Directorio");
			esdirectorio = fichero.isDirectory();
			
			System.out.println("Ruta absoluta"+fichero.getAbsolutePath());
			
			System.out.println("Permiso escritura: "+fichero.canWrite());
			escritura = fichero.canWrite();
			System.out.println("Permiso lectura: "+fichero.canRead());
			lectura = fichero.canRead();
			System.out.println("Permiso ejecución: "+fichero.canExecute());
			ejecucion = fichero.canExecute();
			
			System.out.println("Nombre: "+fichero.getName());
			System.out.println("Espacio total: "+fichero.getTotalSpace());
			date = LocalDate.ofInstant(new Date(fichero.lastModified()).toInstant(),ZoneId.systemDefault());
						
			System.out.println("Fecha ultima modificacion: "+date);
			System.out.println("Tamaño del fichero en bytes: "+fichero.length());
			System.out.println("Lista de archivos: ");
			for(int i=0;i<fichero.listFiles().length;i++) {	
				System.out.println((fichero.listFiles()[i]));
			}
		}
		else if(fichero.isFile()&&fichero.exists()) {
			System.out.println("Ruta absoluta"+fichero.getAbsolutePath());
			
			System.out.println("Permiso escritura: "+fichero.canWrite());
			escritura = fichero.canWrite();
			System.out.println("Permiso lectura: "+fichero.canRead());
			lectura = fichero.canRead();
			System.out.println("Permiso ejecución: "+fichero.canExecute());
			ejecucion = fichero.canExecute();
			
			System.out.println("Nombre: "+fichero.getName());
			System.out.println("Espacio total: "+fichero.getTotalSpace());
			date = LocalDate.ofInstant(new Date(fichero.lastModified()).toInstant(),ZoneId.systemDefault());
						
			System.out.println("Fecha ultima modificacion: "+date);
			System.out.println("Tamaño del fichero en bytes: "+fichero.length());

		}
		
		return path;
	}
	
}
