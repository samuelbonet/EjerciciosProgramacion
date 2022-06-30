package visibilidad2;


public class EmpleadoEspecial {
	
	private String nombreEs;
	private float sueldoEs;
	private String direccionEs;
	private int edad;
	
	
	public EmpleadoEspecial(String nombreEs, float sueldoEs, String direccionEs, int edad) {
		this.nombreEs=nombreEs;
		this.sueldoEs=sueldoEs;
		this.direccionEs=direccionEs;
		this.edad=edad;
	}
	static public void mostrarEnPantalla(String mensaje){
		System.out.println(mensaje);
	}
	
	
}
