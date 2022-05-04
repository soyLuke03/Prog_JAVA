package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import utils.PersonaComparator;
import utils.PersonaException;

public abstract class Persona {

	private List<Mensaje> mensajes;
	private int edad;
	private String nombre;
	
	protected Persona(String nombre,int edad) {
		this.nombre = nombre;
		mensajes = new ArrayList<>();
		this.edad = edad;
	}
	
	
	public String getRemitente() {
		return this.toString();
	}
	
	public boolean enviarMensaje(Persona persona, String msg) {
		boolean enviado = false;
		if(persona!=null) {
			
			if (this instanceof Alumno && edad < 18 && persona instanceof Alumno) {
				throw new PersonaException("ERROR");
			}
			enviado = true;
			persona.mensajes.add(new Mensaje(persona, msg));
		}
		
		return enviado;
	}
	
	public StringBuilder verMensaje() {
		StringBuilder sb = new StringBuilder();
		if(!this.mensajes.isEmpty()) {
			for(int i=0;i<mensajes.size();i++) {
				sb.append(mensajes.get(i));
				sb.append("\n");
			}
		}else {
			throw new PersonaException("Sin mensajes");
		}
		return sb;
	}
	
	public StringBuilder verMensajesOrdenados() {
		
		StringBuilder sb = new StringBuilder();
		List<Mensaje> msg = new ArrayList<>();
		
		if(!this.mensajes.isEmpty()) {
		
		for (int i= 0;i<mensajes.size();i++) {
			msg.add(mensajes.get(i)); 
		}
		msg.sort(new PersonaComparator());
		
			for(int i=0;i<mensajes.size();i++) {
				sb.append(mensajes.get(i));
				sb.append("\n");
			}
		}else {
			throw new PersonaException("Sin mensajes");
		}
		return sb;
	}

	
	public boolean eliminarMensaje(int numeroMensaje) {
		boolean eliminado = false;
		
		if(!this.mensajes.isEmpty()) {
			for(int i=0;i<mensajes.size();i++) {
				if(mensajes.get(i).getNumeroMensaje()==numeroMensaje) {
					mensajes.remove(i);
					eliminado = true;
				}
			}
		}else {
			throw new PersonaException("Sin mensajes");
		}
		
		
		return eliminado;
	}
	
	public String encontrarMensaje(String busqueda) {
		
		StringBuilder sb = new StringBuilder();
		
		if(!this.mensajes.isEmpty()) {
			for(int i=0;i<mensajes.size();i++) {
				if(mensajes.get(i).getTextoMsg().contains(busqueda)) {
					sb.append(mensajes.get(i));
					sb.append("\n");
				}
			}
		}else {
			throw new PersonaException("Sin mensajes");
		}
		
				
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return nombre;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
