package visibilidad1;

import visibilidad2.EmpleadoEspecial;

public class Principal {
					
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emple;
															
		JefeEspecial jefeEs;
		EmpleadoEspecial empleadoEs;
												
		String nombreEs = "fernando";
		float sueldoEs = 1000;
		String direccionEs = "Francisco Vitoria";
																	
		int sueldo = 2000;
		String nombre = "Pepe";
		String direccion = "Zaragoza";
		int edad = 30;
											
						
														
															
		emple= new Empleado(sueldo,nombre ,direccion, edad);
		emple.mostrarEnPantalla("Sueldo: "+sueldo+" Nombre: "+nombre+" Direccion: "+direccion+" Edad: "+edad);
					
																							
			
		System.out.println("\n\tVamos a insertar los datos del jefe: ");
		
		Jefe jefe=new Jefe(sueldo, nombre, direccion, edad,nombreEs);
		jefe.mostrarEnPantalla("Sueldo: "+sueldo+" Nombre: "+nombre+" Direccion: "+direccion+" Edad: "+edad+" NombreEs: "+nombreEs);
		
		
		System.out.println("\n\tVamos a insertar los datos del jefe especial: ");
		
		jefeEs=new JefeEspecial(sueldoEs, nombreEs, direccion, edad);
		jefeEs.mostrarEnPantalla(direccion);
			
			
		System.out.println("\n\tVamos a insertar los datos del empleado especial: ");
					
		empleadoEs=new EmpleadoEspecial( nombreEs,  sueldoEs,  direccionEs, edad);
		empleadoEs.mostrarEnPantalla(direccionEs);
		
			
		System.out.println("\n\tDatos del empleado: " +sueldo+" "+nombre+" "+direccion+" "+edad);
		System.out.println("\n\tDatos del jefe: " +sueldo+" "+nombre+" "+direccion+" "+edad);
		System.out.println("\n\tDatos del jefe especial: " +sueldoEs+" "+nombreEs+" "+direccion+edad);
		System.out.println("\n\tDatos del empleado especial: " +nombreEs+" "+sueldoEs+" "+direccionEs+" "+edad);
	}

}
