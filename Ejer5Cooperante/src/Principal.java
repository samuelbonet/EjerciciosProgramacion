import java.util.Arrays;

import utilidades.Leer;

public class Principal {
	static Cooperante[] vCoop=new Cooperante[0]; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu= {"Salir","Alta Asalariado","Alta Voluntario",
				"Listado Cooperantes","Listado Asalariados",
				"Listado Voluntarios"};
		int opcion;
		String dni;
		Asalariado objAsalariado;
		
		do {
			opcion=Leer.pedirEntero(menu);
			switch(opcion) {
			case 1://Alta Asalariado
				dni=pedirDni();
				if (!encontrarCoop(dni)) {
					vCoop=Arrays.copyOf(vCoop,vCoop.length+1);
					objAsalariado=altaAsalariado(dni);
					vCoop[vCoop.length-1]=objAsalariado;
				}else
					Leer.mostrarEnPantalla("Ya existe ese Cooperante");
				break;
			case 2://Alta Voluntario
				dni=pedirDni();
				if (!encontrarCoop(dni)) {
					vCoop=Arrays.copyOf(vCoop,vCoop.length+1);
					Voluntario objVoluntario=altaVoluntario(dni);
					vCoop[vCoop.length-1]=objVoluntario;
				}else
					Leer.mostrarEnPantalla("Ya existe ese Voluntario");
				break;
			case 3://Listado Cooperantes

				listarCooperantes();
				break;
				
			case 4://Listado Asalariados
				listarAsalariados();
				break;
			case 5://Listado Voluntarios

				listarVoluntarios();
				break;
			}
			
		}while(opcion!=0);
	}
	public static String pedirDni() {
		char[] vLetras= {'T','R','W','A','G','M','Y','F','P','D','X','B',
				'N','J','Z','S','Q','V','H','L','C','K','E'};
		String dni;
		int num=0;
		boolean correcto=false;
		
		do {
			dni=Leer.pedirCadena("Dame el DNI: ");
			try {
				num=Integer.parseInt(dni.substring(0, dni.length()-1));
				if(num>1 && num<99999999 && 
						dni.toUpperCase().charAt(dni.length()-1)==vLetras[num%23])
					correcto=true;
				else
					Leer.mostrarEnPantalla("DNI Incorrecto");
			}catch (NumberFormatException e) {
				Leer.mostrarEnPantalla("DNI Incorrecto");
			}
		}while (!correcto);
		return dni;
	}
	
	public static boolean encontrarCoop(String dni) {
		boolean encontrado=false;
		for(int i=0;i<vCoop.length && !encontrado;i++) {
			if(vCoop[i].getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public static Asalariado altaAsalariado(String dni) {
		Asalariado objAsalariado;
		String nombre,pais;
		double sueldo;
		nombre=Leer.pedirCadena("NOMBRE: ");
		pais=Leer.pedirCadena("PAIS: ");
		sueldo=Leer.pedirDouble("SUELDO: ");
		objAsalariado=new Asalariado(nombre,dni,pais,sueldo);
		return objAsalariado;
	}
	public static Voluntario altaVoluntario(String dni) {
		Voluntario objVoluntario;
		String nombre,pais;
		String ong;
		nombre=Leer.pedirCadena("NOMBRE: ");
		pais=Leer.pedirCadena("PAIS: ");
		ong=Leer.pedirCadena("ONG: ");
		objVoluntario=new Voluntario(nombre,dni,pais,ong);
		return objVoluntario;
	}
	
	
	private static void listarCooperantes() {
		for (int i=0; i<vCoop.length;i++) {
			Leer.mostrarEnPantalla(vCoop[i].toString()); 
		
		}
	}
	
	private static void listarAsalariados() {
		for (int i=0; i<vCoop.length;i++) {
			if(vCoop[i] instanceof Asalariado) {
				Leer.mostrarEnPantalla(vCoop[i].toString());
				
			}
		}
	}
	
	private static void listarVoluntarios() {
		for (int i=0; i<vCoop.length;i++) {
			if(vCoop[i] instanceof Voluntario) {
				Leer.mostrarEnPantalla(vCoop[i].toString()); 
			}
		
	}
	
	}

}

