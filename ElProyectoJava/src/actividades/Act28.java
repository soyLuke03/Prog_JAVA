package actividades;

import java.util.Scanner;

public class Act28 {
	
	public static void main(String[] args) {
		
		
		fibo(1);
				
		
		}
		
	public static void fibo(int numero) {
	
		int fiboPrevio = 0;
		int fiboActual = 1;
		int temp;
		
		for (int i = 1; i<=numero ;i++) {
			if (i == 1) {
				System.out.println(fiboPrevio);
			}
			else {
				temp = fiboActual;
				
				fiboActual +=fiboPrevio;
				
				System.out.println(fiboActual);
				
				fiboPrevio = temp;
			
			}
			
	}
	
		
		
		
		
		
		
		
		
		
		/*
       Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
        */
    }
		

			

        
        
        
	}
					
			
			
			
	
	
	
