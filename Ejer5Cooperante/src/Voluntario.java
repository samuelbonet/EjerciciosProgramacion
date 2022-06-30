import utilidades.Leer;

public class Voluntario extends Cooperante {

	private String ong;

	public Voluntario(String nombre, String dni, String pais, String ong) {
		super(nombre, dni, pais);

		this.ong = ong;

	}

	public void muestraDatos() {
		Leer.mostrarEnPantalla(super.getNombre() + super.getDni() + super.getPais()+ ong);
	}
	
	@Override
	public String toString() {
		return "Voluntario [nombre="+getNombre()+",dni="+getDni()+",pais="+getPais()+",ong="+ong+"]";
		
	}
}