package model;

public class Calle {

	private String nombre;
	private int idCalle;
	
	public Calle() {
		
	}

	public Calle(String nombre, int idCalle) {
		super();
		this.nombre = nombre;
		this.idCalle = idCalle;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIdCalle() {
		return idCalle;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdCalle(int idCalle) {
		this.idCalle = idCalle;
	}

	@Override
	public String toString() {
		return "Calle [nombre=" + nombre + ", idCalle=" + idCalle + "]";
	}
	
}
