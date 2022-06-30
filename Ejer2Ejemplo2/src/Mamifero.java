import utilidades.Leer;

public class Mamifero extends Animal {
	private int numhuesos;
	private int numextremidades;

	public Mamifero(int numcrias,int numhuesos,int numextremidades) {
		super(numcrias);
		this.numhuesos=numhuesos;
		this.numextremidades=numextremidades;
	}

	

	public void insertarDatosMamifero() {
		insertarDatos();
		numhuesos = Leer.pedirEntero("\t\tNúmero de huesos (como mamífero que es)");
		numextremidades = Leer.pedirEntero("\t\tNúmero de extremidades (como mamífero que es): ");
	}

	public void visualizarDatosMamifero() {
		visualizarDatosAnimal();
		Leer.mostrarEnPantalla("\n\t Huesos: " + numhuesos);
		Leer.mostrarEnPantalla("\n\t Extremidades: " + numextremidades);
	}
}
