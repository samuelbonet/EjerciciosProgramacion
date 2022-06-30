import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado = new Empleado();
		Jefe jefe = new Jefe();

		final int numEmpleados, numJefes;
		Empleado vEmpleados[];
		Jefe vJefe[];
		numEmpleados = Leer.pedirEntero("Introduce el numero de empleados");
		numJefes = Leer.pedirEntero("Introduce el numero de jefes");

		vEmpleados = new Empleado[numEmpleados];
		vJefe = new Jefe[numJefes];

		llenarEmpleados(vEmpleados);
		llenarJefes(vJefe);
		
		visualizarEmpleado(vEmpleados);
		visualizarJefes(vJefe);
		
	}

	public static void llenarEmpleados(Empleado[] vEmpleados) {
		String nombre;// ATRIBUTO
		float sueldo;// ATRIBUTO

		for (int i = 0; i < vEmpleados.length; i++) {
			Leer.mostrarEnPantalla("Empleado nº1" + i + 1);
			nombre = Leer.pedirCadena("Dame el nombre:");
			sueldo = Leer.pedirFloat("Dame el sueldo:");
			vEmpleados[i] = new Empleado();
			vEmpleados[i].setTodo(nombre, sueldo);// MUESTRA NOMBRE Y SUELDO

		}

	}

	public static void llenarJefes(Jefe[] vJefe) {
		String nombreJefe;// ATRIBUTO
		float sueldoJefe;// ATRIBUTO
		String departJefe;// ATRIBUTO
		String titulUniv;// ATRIBUTO

		for (int i = 0; i < vJefe.length; i++) {

			Leer.mostrarEnPantalla("Jefe nº1" + i + 1);
			nombreJefe = Leer.pedirCadena("Dame el nombre:");
			sueldoJefe = Leer.pedirFloat("Dame el sueldo:");
			departJefe = Leer.pedirCadena("Dame el departamento:");
			titulUniv = Leer.pedirCadena("Dame el titulo:");
			vJefe[i] = new Jefe();

			vJefe[i].setTodo(nombreJefe, sueldoJefe, departJefe, titulUniv);

		}

	}

	public static void visualizarEmpleado(Empleado vEmpleados[]) {
		for (int i = 0; i < vEmpleados.length; i++) {
			System.out.println("Datos del empleado:" + (i + 1));
			vEmpleados[i].imprimeTodo();
		}

	}

	public static void visualizarJefes(Jefe vJefe[]) {
		for (int i = 0; i < vJefe.length; i++) {
			System.out.println("Datos del empleado:" + (i + 1));
			vJefe[i].imprimeTodo();
		}
	}
}
