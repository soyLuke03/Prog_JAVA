package ClaseEjercicio4;

import java.util.Scanner;

public class Complejo {
	
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
	
	public void compararDosNumeros() {
		
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
		
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		if (pImaginaria1 < 0) {
			 sb1.append(pReal1);
			 sb1.append(pImaginaria1);
			 sb1.append("i");
		 }else {
			 sb1.append(pReal1);
			 sb1.append("+");
			 sb1.append(pImaginaria1);
			 sb1.append("i");	 
			 }
		
		if (pImaginaria2 < 0) {
			 sb2.append(pReal2);
			 sb2.append(pImaginaria2);
			 sb2.append("i");
		 }else {
			 sb2.append(pReal2);
			 sb2.append("+");
			 sb2.append(pImaginaria2);
			 sb2.append("i");	 
			 }
		
		System.out.println(sb1.equals(sb2));	
	}
	//Setter
	//Getter

}
