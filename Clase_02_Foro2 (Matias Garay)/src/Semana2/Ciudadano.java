package Semana2;

public class Ciudadano extends Persona{

		
		private String provincia;
		private long dni;

		public Ciudadano (String nombre, String apellido, String provincia, long dni) {
			super (nombre, apellido);
			this.provincia = provincia;
			this.dni = dni;
		}
		
		public String toString(){ 
			return super.toString()+ ">Provincia: " +provincia+ ">DNI: " +dni;
		}
		
	
		
		public String getProvincia () {
			return provincia;
		}
		
		public long getDni () {
			return dni;
		}
		
		public void setProvincia (String provincia) {
			this.provincia = provincia;
		} 
		public void setDni(long dni) {
			this.dni = dni;
		}
		
		

}
