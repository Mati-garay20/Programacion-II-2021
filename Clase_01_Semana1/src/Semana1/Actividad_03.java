package Semana1;

import java.util.Scanner;

public class Actividad_03 {

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("  HOLA!!  ");
		System.out.println("");
		System.out.println(" Ingresar 2 números y se colocaran todos los enteros en orden");
	
		System.out.println("Ingrese el primer número: ");
			int num1= scan.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
			int num2= scan.nextInt();
			
		int numX=(0); 
			
			 if (num1>num2){
	             numX=num1;
	             num1=num2;
	             num2=numX;
			 }
			
		System.out.println("");
		System.out.println("> Resultado en orden: ");
		
		 for (int i=num1;i<=num2;i++){
             System.out.println(i);
		 }
	}	 
	
}
