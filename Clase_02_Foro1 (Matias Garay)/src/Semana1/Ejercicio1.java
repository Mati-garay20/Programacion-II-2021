package Semana1;

import java.util.Scanner;

public class Ejercicio1 {
	//Almacenar oraciones
	public static void main(String[] args){
		
		Scanner Leer = new Scanner(System.in);
		
		String [] Vector = new String [4];
		
		for (int i=0; i<4; i++) {
			System.out.println("Ingresar una oraci�n");
			Vector[i] = Leer.nextLine();
		}
		
		for (int i = 0; i<Vector.length ; i++){
			System.out.println(Vector[i]);
		}
	}
}
