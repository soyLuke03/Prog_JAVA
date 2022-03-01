package JuegoDeCartas;

import java.util.Objects;

public class Cartas extends Baraja{



	private Integer number;
	private String palo;
	private Double valor;
	
	
	//Contructor
	
	public Cartas() {}
	
	//Getter
	public Integer getNumber() {
		return number;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public Double getValor() {
		return valor;
	}

	
	//Overrides
	
	@Override
	public String toString() {
		return "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = true;
		
		if (this == obj)
			sonIguales = true;
		else if (obj == null)
			sonIguales = false;
		else if (getClass() != obj.getClass())
			sonIguales = false;
		
		Cartas other = (Cartas) obj;
		
		return Objects.equals(number, other.number) && Objects.equals(palo, other.palo)
				&& Objects.equals(valor, other.valor);
	}
	
	
	
}
