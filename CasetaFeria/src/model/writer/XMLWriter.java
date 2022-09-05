package model.writer;

import java.io.File;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import model.Caseta;

public class XMLWriter {

	/**
	 * Crea un XML con los datos de la colección pasada por argumento
	 * en la ruta enviada por parámetro.
	 * @param casetas
	 * @param path
	 */
	public void crearArchivoDatosXML(Collection<Caseta> casetas, String path) {
		
		try {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		Element raiz = document.createElement("casetas");
		document.appendChild(raiz);
		
		for(Caseta caseta : casetas) {
			Element elementoCaseta = document.createElement("caseta");
			raiz.appendChild(elementoCaseta);
			
			//Añadir atributo a la caseta
			Attr atributo = document.createAttribute("id");
			atributo.setValue(caseta.getId().toString());//
			elementoCaseta.setAttributeNode(atributo);
			
			Attr atributoCalle = document.createAttribute("id_calle");
			atributoCalle.setValue(caseta.getIdCalle().toString());
			elementoCaseta.setAttributeNode(atributoCalle);
			
			//Añadir elemento NOMBRE a la caseta
			Element titulo = document.createElement("titulo");
			Node textoTitulo = document.createTextNode(caseta.getTitulo());
			titulo.appendChild(textoTitulo);
			elementoCaseta.appendChild(titulo);
			
			
			Element calle = document.createElement("calle");
			Node textoCalle = document.createTextNode(caseta.getCalle());
			calle.appendChild(textoCalle);
			elementoCaseta.appendChild(calle);
			
			Element numero = document.createElement("numero");
			Node textoNumero = document.createTextNode(caseta.getNumero().toString());
			numero.appendChild(textoNumero);
			elementoCaseta.appendChild(numero);
			
			Element modulos = document.createElement("modulos");
			Node textoModulos = document.createTextNode(caseta.getModulo().toString());
			modulos.appendChild(textoModulos);
			elementoCaseta.appendChild(modulos);
			
			Element clase = document.createElement("clase");
			Node textoClase = document.createTextNode(caseta.getClase());
			clase.appendChild(textoClase);
			elementoCaseta.appendChild(clase);
			
			Element entidad = document.createElement("entidad");
			Node textoEntidad = document.createTextNode(caseta.getEntidad());
			entidad.appendChild(textoEntidad);
			elementoCaseta.appendChild(entidad);
			
			
		}//Final del bucle FOR
		
		TransformerFactory tfactory = TransformerFactory.newDefaultInstance();
		Transformer transformer = tfactory.newTransformer();
		//Esto permite al archivo aparecer en lineas diferentes
		//con su indentación correspondiente.
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		
		
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(path));
		
		
		transformer.transform(source, result);
		
		
		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
