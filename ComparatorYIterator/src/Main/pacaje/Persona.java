package Main.pacaje;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String apellidos;
	private String dni;
	
	
	public Persona() {
		
	}


	public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDni() {
		return dni;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", apellidos=" + apellidos
				+ ", dni=" + dni + "]";
	}
	
	
	
}
