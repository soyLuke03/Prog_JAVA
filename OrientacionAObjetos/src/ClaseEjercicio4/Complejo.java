package ClaseEjercicio4;

import java.util.Objects;
import java.util.Scanner;

public class Complejo {
	
	
//	Correción
	
	




	@Override
	public int hashCode() {
		return Objects.hash(imaginario, real);
	}

	@Override
	public boolean equals(Object obj) {
		
		Complejo otro = (Complejo) obj;
		boolean sonIguales = false;
		
		if(this.real.equals(otro.getReal()) && this.imaginario.equals(otro.getImaginario())) {
			sonIguales = true;
		}
		
		return sonIguales;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+real+", "+imaginario+")" ;
	}
	
	
	private Double real;
	private Double imaginario;
	
	
	
	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	
	
	public Complejo suma(Complejo otroComplejo) {
		double real = this.real + otroComplejo.getReal();
		double imaginario = this.imaginario + otroComplejo.getImaginario();
		
		return new Complejo(real, imaginario);
	}
	
	
	public Double getReal() {
		return real;
	}
	public Double getImaginario() {
		return imaginario;
	}
	
	
	/*
	public void equals() {
		boolean sonIguales = false;
		
		System.out.println("Introduce la parte real: ");
		double pReal1 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria1 = Integer.valueOf(sc1.nextLine());
		Complejo com1 = new Complejo(pReal1,pImaginaria1);
		
		System.out.println("Introduce la parte real: ");
		double pReal2 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria2 = Integer.valueOf(sc1.nextLine());
		Complejo com2 = new Complejo(pReal2,pImaginaria2);

		
		if (com1.parteReal.equals(com2.parteReal) && com1.parteImaginaria.equals(com2.parteImaginaria)) {
			sonIguales = true;
		}
		
		
		System.out.println(pReal1 + " " + pImaginaria1 + "i \n"
						  + pReal2 + " " + pImaginaria2 + "i \n");
		System.out.println("Son iguales: " + sonIguales);
	}
	
	

	private Double parteReal = 0.0;
	private Double parteImaginaria = 0.0;
	static Scanner sc1 = new Scanner(System.in);
	
	//Constructor
	
	Complejo(double parteReal, double parteImaginaria){
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public Complejo() {} //Default constructor

	//Metodos
	public void mostrarNumero() {
		if (this.parteImaginaria < 0) {
			System.out.println(this.parteReal+""+this.parteImaginaria + "i");
		}else{
			System.out.println(this.parteReal+"+"+this.parteImaginaria + "i");
		}
	}
	
	public void sumaDosNumeros() {
		double pRealNueva;
		double pImaginariaNueva;
		
		System.out.println("Introduce la parte real: ");
		double pReal1 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria1 = Integer.valueOf(sc1.nextLine());
		Complejo com1 = new Complejo(pReal1,pImaginaria1);
		
		System.out.println("Introduce la parte real: ");
		double pReal2 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria2 = Integer.valueOf(sc1.nextLine());
		Complejo com2 = new Complejo(pReal2,pImaginaria2);
		
		
		 pRealNueva = pReal1 + pReal2;
		 pImaginariaNueva = pImaginaria1 + pImaginaria2;
		 
		 if (pImaginariaNueva < 0) {
			 System.out.println(pRealNueva+""+pImaginariaNueva + "i");
		 }else {
			 System.out.println(pRealNueva+"+"+pImaginariaNueva + "i");
		 }
	}
	
	public void restaDosNumeros() {
		double pRealNueva;
		double pImaginariaNueva;
		
		System.out.println("Introduce la parte real: ");
		double pReal1 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria1 = Integer.valueOf(sc1.nextLine());
		Complejo com1 = new Complejo(pReal1,pImaginaria1);
		
		System.out.println("Introduce la parte real: ");
		double pReal2 = Integer.valueOf(sc1.nextLine());
		System.out.println("Introduce la parte imaginaria (SIN INCLUIR LA i): ");
		double pImaginaria2 = Integer.valueOf(sc1.nextLine());
		Complejo com2 = new Complejo(pReal2,pImaginaria2);
		
		 pRealNueva = pReal1 - pReal2;
		 pImaginariaNueva = pImaginaria1 - pImaginaria2;
		 
		 if (pImaginariaNueva < 0) {
			 System.out.println(pRealNueva+""+pImaginariaNueva + "i");
		 }else {
			 System.out.println(pRealNueva+"+"+pImaginariaNueva + "i");
		 }
		 
		 
	}
	
	*/
}
