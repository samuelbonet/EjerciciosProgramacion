import utilidades.Leer;

public class Persona extends Mamifero {

	private String profesion;

	public Persona(int numcrias,int numhuesos,int numextremidades,String profesion) {
		super(numcrias,numhuesos,numextremidades);

		System.out.print(" y persona");
		this.profesion=profesion;
	}



	void insertarDatosPersona() {
		insertarDatosMamifero();
		profesion = Leer.pedirCadena("\t\tProfesión de esta persona: ");
	}

	public void visualizarDatos() {
		visualizarDatosMamifero();
		Leer.mostrarEnPantalla("\n\t profesión: " + profesion);
	}
}
