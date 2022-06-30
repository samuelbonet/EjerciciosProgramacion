package visibilidad1;


import visibilidad2.EmpleadoEspecial;

public class JefeEspecial extends EmpleadoEspecial {
	public JefeEspecial(float sueldoEs,String nombreEs,String direccionEs,int edad) {
		super(nombreEs, sueldoEs, direccionEs,edad);
	}
	static public void mostrarEnPantalla(String mensaje){
		System.out.println(mensaje);
	}
	

}
