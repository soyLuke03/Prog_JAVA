package app.model;

import java.util.Objects;

public class Carta {

	private Double number;
	private Palo palo;
	
	
	//Builder
	public Carta(Double number, Palo palo) {
		super();
		this.number = number;
		this.palo = palo;
	}

	//Metodos
	
	public Double getValor(Carta carta){
		Double valor;
		if (this.number <=7) {
			valor = number;
		}
		else {
			valor = 0.5;
		}
		
		return valor;
	}
	
	//Getters
	public Double getNumber() {
		return number;
	}
	public Palo getPalo() {
		return palo;
	}

	//Setter
	public void setNumber(Double number) {
		this.number = number;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	
	//Otros
	
	@Override
	public String toString() {
		return "Carta| numero:" + number + ", palo:" + palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
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
		Carta other = (Carta) obj;
		return Objects.equals(number, other.number) && palo == other.palo;
	}
	
}
