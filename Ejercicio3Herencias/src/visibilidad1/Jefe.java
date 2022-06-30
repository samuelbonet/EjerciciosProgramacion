package visibilidad1;



import visibilidad2.EmpleadoEspecial;
public class Jefe extends Empleado {

	private String nombreEs;
	public Jefe(int sueldo,String nombre, String direccion, int edad,String NombreEs){
			/*super.
			 * Se puede acceder:
			 * nombre-visibilidad package
			 * direccion-visibilidad protected
			 * edad-visibilidad public
			 * NO sueldo private
			 * 
			 */
		super( sueldo, nombre,  direccion, edad);
	
		this.nombreEs=NombreEs;
		EmpleadoEspecial objEmpleadoEspecial = new EmpleadoEspecial("Samuel",1500 ,"Calle Almansa", 21);
		
		
	}
	static public void mostrarEnPantalla(String mensaje){
		System.out.println(mensaje);
	}
	

}