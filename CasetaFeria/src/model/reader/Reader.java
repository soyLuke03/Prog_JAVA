package model.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Caseta;

public class Reader {

	
	
	public List<Caseta> cargarArchivosDatos(String path){
		List<Caseta> casetas = new ArrayList<>();
		
		File archivo = new File(path);
		if(archivo.exists()) {
			try {
				
			DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();     
			DocumentBuilder builder = factory.newDocumentBuilder();					
			Document documento = builder.parse(archivo);
			
			documento.getDocumentElement().normalize();
			
			/*------------------------------*/
			
			NodeList listaNodos = documento.getElementsByTagName("DatosLeidos");
			
			for(int i=0;i<listaNodos.getLength();i++) {
				Element elemento = (Element)listaNodos.item(i);
				
			
			String titulo = null;
			String calle = null;
			int numero = -1;
			int modulo = -1;
			String clase = null;
			String entidad = null;
			int id = -1;
			int idCalle = -1;
			
			if(elemento.getElementsByTagName("TITULO").item(0)!=null) {
				titulo = elemento.getElementsByTagName("TITULO").item(0).getTextContent();
			}
			if(elemento.getElementsByTagName("CALLE").item(0)!=null) {
				calle = elemento.getElementsByTagName("CALLE").item(0).getTextContent();
			}
			if(elemento.getElementsByTagName("NUMERO").item(0)!=null) {
				numero =Integer.valueOf(elemento.getElementsByTagName("NUMERO").item(0).getTextContent());
			}
			if(elemento.getElementsByTagName("MODULOS").item(0)!=null) {
				modulo =Integer.valueOf(elemento.getElementsByTagName("MODULOS").item(0).getTextContent());
			}
			if(elemento.getElementsByTagName("CLASE").item(0)!=null) {
				clase = elemento.getElementsByTagName("CLASE").item(0).getTextContent();
			}
			if(elemento.getElementsByTagName("ENTIDAD").item(0)!=null) {
				entidad = elemento.getElementsByTagName("ENTIDAD").item(0).getTextContent();
			}
			if(elemento.getElementsByTagName("ID").item(0)!=null) {
				id =Integer.valueOf(elemento.getElementsByTagName("ID").item(0).getTextContent());
			}
			if(elemento.getElementsByTagName("ID_CALLE").item(0)!=null) {
				idCalle =Integer.valueOf(elemento.getElementsByTagName("ID_CALLE").item(0).getTextContent());
			}
			
			Caseta caseta = new Caseta(titulo, calle, numero, modulo, clase, entidad, id, idCalle);
			casetas.add(caseta);
			}
			
			
			}
			catch (ParserConfigurationException | SAXException | IOException e) {
				e.printStackTrace();
			}
		}
		
		return casetas;
	}
	
	
	
}
