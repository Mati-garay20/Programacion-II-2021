package Semana2;

public class Controlador1 {

	public static void main (String[] args){
		
		boolean E;
		
		Persona1 miPersona = new Persona1("Matías  ", "Garay ");
		System.out.println(miPersona);
		
		System.out.println("_______________________________________________________________________");
		
		Ciudadano1 miCiudadano = new Ciudadano1("Miguel ", "Gonzalez ", "Mendoza ", 45342657);
		System.out.println(miCiudadano);
		
		System.out.println("_______________________________________________________________________");
		
		Ciudadano1 miCiudadano1 = new Ciudadano1("Margarita ", "Rosa ", "Mendoza ", 23456098);
		System.out.println(miCiudadano1);
		
		
		//.....................
		E = miCiudadano.equals (miCiudadano1);
		System.out.println (E);
		
		
		
	}
}

