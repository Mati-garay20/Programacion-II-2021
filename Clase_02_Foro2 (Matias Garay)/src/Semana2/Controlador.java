package Semana2;

public class Controlador {

	public static void main (String[] args){
		
		Persona miPersona = new Persona("Matías  ", "Garay ");
		System.out.println(miPersona);
		
		System.out.println("_______________________________________________________________________");
		
		Ciudadano miCiudadano = new Ciudadano("Miguel ", "Gonzalez ", "Mendoza ", 45342657);
		System.out.println(miCiudadano);
		
		System.out.println("_______________________________________________________________________");
		
		Ciudadano miCiudadano1 = new Ciudadano("Margarita ", "Rosa ", "Mendoza ", 23456098);
		System.out.println(miCiudadano1);
	}
}

