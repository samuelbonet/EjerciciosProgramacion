import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Empleado emple;
		Jefe jefe;
		String nombre;
		float sueldo;
		String departJefe;
		String titulUniv;
		
		Leer.mostrarEnPantalla("\n\tVamos a insertar los datos del empleado: ");		
		nombre=Leer.pedirCadena("\n\t\tNOMBRE ");		
		sueldo=Leer.pedirFloat("\n\t\tSUELDO ");		
		emple=new Empleado(nombre, sueldo);
		
		Leer.mostrarEnPantalla("\n\tVamos a insertar los datos del jefe: ");
		nombre=Leer.pedirCadena("\n\t\tNOMBRE ");		
		sueldo=Leer.pedirFloat("\n\t\tSUELDO ");				
		departJefe=Leer.pedirCadena("\n\t\tDEPARTAMENTO DEL QUE ES JEFE? ");
		titulUniv=Leer.pedirCadena("\n\t\tTITULO UNIVERSITARIO? ");
		jefe=new Jefe(nombre, sueldo, departJefe, titulUniv);
		
		System.out.println("\n\tVamos a mostrar los datos del empleado: ");
		emple.imprimeTodo();
		System.out.println("\n\tVamos a mostrar los datos del jefe: ");
		jefe.imprimeTodo();
	}
}
