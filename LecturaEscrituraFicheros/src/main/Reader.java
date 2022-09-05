package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Reader {

	public String lectorTXT(String path){
		StringBuilder sb = new StringBuilder();
		
		
		try {
		
			File archivo = new File(path);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
		
			String linea = br.readLine();
			while (linea!=null) {
				sb.append(linea+"\n");
				linea = br.readLine();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
