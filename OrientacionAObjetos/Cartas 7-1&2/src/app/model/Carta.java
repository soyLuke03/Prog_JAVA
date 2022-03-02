package app.model;

public class Carta {

	private Integer number;
	private Palo palo;
	
	
	//Builder
	public Carta(Integer number, Palo palo) {
		super();
		this.number = number;
		this.palo = palo;
	}

	//Metodos
	
	
	//Getters
	public Integer getNumber() {
		return number;
	}
	public Palo getPalo() {
		return palo;
	}

	//Setter
	public void setNumber(Integer number) {
		this.number = number;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	
	//Otros
	
	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}
	
}
