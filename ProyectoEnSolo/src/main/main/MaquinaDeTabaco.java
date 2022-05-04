package main.main;

import java.util.Map;

import main.model.InventarioDePaquetes;
import main.model.Moneda;
import main.model.Monedero;
import main.utils.MonederoException;

public class MaquinaDeTabaco {

	private String nombre;
	private String ubicacion;
	private boolean operativa;
	private InventarioDePaquetes invPaquetes;
	private Monedero monedero;
	
	public MaquinaDeTabaco(String nombre, String ubicacion, boolean operativa, InventarioDePaquetes inventario, Monedero monedero) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.operativa = operativa;
		this.invPaquetes = inventario;
		this.monedero = monedero;
	}

	public boolean MaquinaComprobarPago(Map<Moneda, Integer> pago, Integer precio) {
		
		boolean pagado = true;
		
		try {
			this.monedero.calcularCambio(pago, precio);			
		} catch (MonederoException m) {
			System.out.println(m);
			pagado = false;
		}
		
		
		return pagado;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "MaquinaDeTabaco [nombre=" + nombre + ", ubicacion=" + ubicacion + ", operativa=" + operativa + "]";
	}

	
	
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public boolean isOperativa() {
		return operativa;
	}

	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public void setOperativa(boolean operativa) {
		this.operativa = operativa;
	}
	
	
	
	
}
