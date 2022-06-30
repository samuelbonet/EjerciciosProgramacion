import utilidades.Leer;

public class Cooperante {
	
		private String nombre;
		private String dni;
		private String pais;
	
		
		
		public Cooperante(String nombre, String dni, String pais) {
		
			this.nombre=nombre;
			this.dni=dni;
			this.pais=pais;
			
		}
		
		public String getNombre() {
			return nombre;
		}

		public String getDni() {
			return dni;
		}

		public String getPais() {
			return pais;
		}

		public void muestraDatos() {
			Leer.mostrarEnPantalla(nombre+dni+pais); //Leer.mostrarEnPantalla("\nDNI:" +this.dni+ "Nombre:" +this.nombre + "Pais:"+this.pais);
		}
}
