package Semana1;

import java.util.Scanner;

public class Actividad_09 {

	public static void main(String[] args) {
		 
		 Scanner contar = new Scanner (System.in);
		
		 System.out.println(" -- HOLA -- ");
		 System.out.println(" Ingrese una palabra  ");
		 String texto= contar.next();
			
			int contador = 0;
		
			for(int x = 0;x < texto.length();x++) {
				 if ((texto.charAt(x) == 'a') || (texto.charAt(x) =='e') || (texto.charAt(x) == 'i') || (texto.charAt(x) == 'o') || (texto.charAt(x) == 'u')){ 
				    contador++;
				 }	    
							 
			}
			System.out.println(texto + " contiene: " + contador + " vocales");
	    }
	
}
