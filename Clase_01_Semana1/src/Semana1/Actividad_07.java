package Semana1;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String usuariocorrecto= "Enzo";
		int contraseñacorrecta= 4321;
		
		System.out.println(" --HOLA-- ");
		
		System.out.println(" Ingrese su Usuario ");
		String usuario= scan.next();
		
		System.out.println(" Ingrese la Contraseña");
		int contraseña = scan.nextInt();
		
			if (usuario.equals(usuariocorrecto) && (contraseña == (contraseñacorrecta))){
				System.out.println(" >> Usuario y Contraseña correctos << ");
				
			}
			else {
				System.out.println(" >> Usuario y Contraseña no son correctos << ");
			}
				
		
	}
	
}
