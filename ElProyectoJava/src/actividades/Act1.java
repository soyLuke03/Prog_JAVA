package actividades;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner (System.in);
		
		System.out.println("Introduce dos números: ");
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0)
		{
			System.out.println("Son múltiplos");
		}
		else {
			System.out.println("No son múltiplos");
		}
		
		
		
		
		
	}

}
