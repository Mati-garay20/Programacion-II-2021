package Semana1;

import java.util.Scanner;

public class Actividad_02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("  HOLA!! ");
		System.out.println("");
		System.out.println(" Ingresar 2 n�meros y se colocaran todos los enteros en orden");
	
		System.out.println("Ingrese el primer n�mero: ");
			int num1= scan.nextInt();
		
		System.out.println("Ingrese el segundo n�mero: ");
			int num2= scan.nextInt();
			
		System.out.println("");
		System.out.println("> Resultado en orden: ");
		
		 for (int i=num1;i<=num2;i++){ 
             System.out.println(i);
		 }
	}
}
