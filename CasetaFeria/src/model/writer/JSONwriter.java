package model.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONwriter {

	public void escribirColeccionAJson(Collection coleccion, String ruta) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
		
			File archivo = new File(ruta);
			archivo.createNewFile();
			
			Writer writer = new FileWriter(archivo);
			gson.toJson(coleccion, writer);
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	}
