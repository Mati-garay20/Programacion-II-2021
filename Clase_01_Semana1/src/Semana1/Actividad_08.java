package Semana1;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String usuariocorrecto= "Enzo";
		int contrase�acorrecta= 4321;
		
		System.out.println(" --HOLA-- ");
		
		System.out.println(" Ingrese su Usuario ");
		String usuario= scan.next();
		
		System.out.println(" Ingrese la Contrase�a");
		int contrase�a = scan.nextInt();
		
			if (usuario.equals(usuariocorrecto) && (contrase�a == (contrase�acorrecta))){
				System.out.println(" >> Usuario y Contrase�a correctos << ");
				
			}
			else {
				System.out.println(" >> Usuario y Contrase�a no son correctos << ");
			}
			
		if (usuario.equals(usuariocorrecto) && (contrase�a == (contrase�acorrecta))){
			System.out.println("");
			System.out.println("");
			System.out.println("  �Desea cambiar su contrase�a? ");
			
					System.out.println("Escriba su nueva contrase�a en n�meros");
					int contrase�anueva = scan.nextInt();
					System.out.println("Su contrase�a fue cambiada con exito");
				
					
		}	
			
			
	}			
	
}
