package main.java.com.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Comparable<Persona> { 

	private final int MAYORIA_EDAD =  18;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	public boolean isMayorDeEdad() {
		boolean isMayor = false;
		
		int fechaNacimiento = this.fechaNacimiento.getYear();
		int fechaActual = LocalDate.now().getYear();
		
		if (fechaActual - fechaNacimiento >= MAYORIA_EDAD) {
			isMayor = true;
		}
		
		return isMayor;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int compareTo(Persona otraPersona) {
		
		int resultado = 0;
		if (this.getApellido()==null || otraPersona.getApellido() == null) {
			resultado = 0;
		}
		
		else if (this.getApellido().compareTo(otraPersona.getApellido()) < 0)
			resultado = -1;
		
		else if (this.getApellido().compareTo(otraPersona.getApellido()) > 0)
			resultado = 1;
		
		// int resultado2 = this.getApellido().compareTo(otraPersona.getApellido());
		
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Persona other = (Persona) obj;
		
		return Objects.equals(apellido, other.apellido) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}

	
	
}
