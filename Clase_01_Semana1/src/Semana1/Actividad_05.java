package Semana1;

import java.util.Scanner;

public class Actividad_05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("  HOLA!!  ");
		System.out.println("");
		System.out.println("  Ingresar 2 números y se colocaran todos los enteros menos los multiplos que usuario decida");
	
		System.out.println("Ingrese el primer número: ");
			int num1= scan.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
			int num2= scan.nextInt();
			
		System.out.println("El número que ingrese a continuación seran quitados sus múltiplos");
			int multi= scan.nextInt();
			
		int numX=(0); 
			
			 if (num1>num2){
	             numX=num1;
	             num1=num2;
	             num2=numX;
			 }
			
		System.out.println("");
		System.out.println("> Resultado en orden quitando los multiplos: ");
		
		 for (int i=num1;i<=num2;i++){
			 if (i%multi!=0){ 
             System.out.println(i);
		 	 }
		 }
	}	 
	
}
