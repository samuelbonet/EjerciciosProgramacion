import utilidades.Leer;

public class Asalariado extends Cooperante {
	
	private double sueldo;
	
	
	public Asalariado(String nombre,String dni, String pais,double sueldo) {
		super(nombre, dni, pais);

		this.sueldo = sueldo;
	
	}
	public double getSueldo() {
		return sueldo;
		
	}

	
	public void muestraDatos() {
		Leer.mostrarEnPantalla(super.getNombre()+super.getDni()+super.getPais()+sueldo);
	}
}
