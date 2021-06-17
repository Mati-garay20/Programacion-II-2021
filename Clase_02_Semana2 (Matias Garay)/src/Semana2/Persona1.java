package Semana2;

public class Persona1 {

	 
	private String nombre;	
	private String apellido;
	private String nivel;
	
	public Persona1 (String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public String toString(){
		return ">Nombre: "+this.nombre+">Apellido: "+this.apellido;
	}

	//.............................
	public boolean equals(Object o){
		Persona1 per = (Persona1) o;
		return (per.nombre == nombre) && (per.nivel == nivel);
	}
	
	
	
	public String getNombre () {
		return nombre;
	}
	public String getApellido () {
		return apellido;
	}
	
	public void setNombre (String nombre) {
		this.nombre =nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}