package Semana1;

import java.util.Scanner;

public class Actividad_07 {

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
				
		
	}
	
}
