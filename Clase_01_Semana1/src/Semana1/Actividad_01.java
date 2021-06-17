package Semana1;

import java.util.Scanner;

public class Actividad_01 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("  Hola!!  ");
		System.out.println("");
		System.out.println("Ingrese un número: ");
			int num1= scan.nextInt(); 
			
		System.out.println("Ingrese otro número: ");
			int num2= scan.nextInt();
			int resultado;
			resultado = num1+num2;
			
		System.out.println(" > El resultado de la suma es: " +resultado ); 
			
	}
}