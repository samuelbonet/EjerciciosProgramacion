package visibilidad1;


public class Empleado {
	private static int sueldo;
	private static String nombre;
	private static String direccion;
	private static int edad;
	
	
	public Empleado(int sueldo, String nombre, String direccion, int edad) {
		this.sueldo=sueldo;
		this.nombre=nombre;
		this.direccion=direccion;
		this.edad=edad;
		
	}
		
	 public static void mostrarEnPantalla(String mensaje){
		System.out.println(mensaje);
	}
	
	
	
	
	
	}



		
