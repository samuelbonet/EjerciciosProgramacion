import utilidades.Leer;

public class Animal {

	private int numcrias;

	public Animal( int numcrias) {
		this.numcrias=numcrias;
		// En un constructor no mostraremos datos en pantalla
		// Esto es un ejemplo y lo hacemos para entender mejor
		// el funcionamiento de las clases y la herencia
		this.numcrias=numcrias;
		System.out.print("\n\tHa nacido un animal ");
		
	}

	public void alimentarse() {
		/*
		 * Este metodo se usa con el fin de ver que es de la clase
		 * Animal y la puede usar cualquier clase que herede de dicha clase 
		 * como si fuera suyo.
		 */
		System.out.println("\t\t\tHora de comer");
	}

	public void insertarDatos() {

		numcrias = Leer.pedirEntero("\n\t\tNúmero de crías(como animal que es): ");
	}

	public void visualizarDatosAnimal() {
		Leer.mostrarEnPantalla("\n\t Crías: " + numcrias);
	}
}