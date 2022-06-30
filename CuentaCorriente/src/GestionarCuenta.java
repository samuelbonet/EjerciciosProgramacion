import java.util.Scanner;
public class GestionarCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_CUENTAS;
		CuentaCorriente[] vectorCuentas;
		Scanner teclado=new Scanner(System.in);
		int numCuentas,opcion;
		Integer numCuentaCorriente;
		double cantidad;
		
		do {
			System.out.println("Dame el número max. de cuentas del banco: ");
			numCuentas=teclado.nextInt();
		}while (numCuentas<1);
		NUM_CUENTAS=numCuentas;
		vectorCuentas=new CuentaCorriente[NUM_CUENTAS];
		
		
		
		do {
			opcion=menu();
			switch (opcion){
			case 1: //CREAR CUENTA
				if (CuentaCorriente.getNumSiguiente()<=NUM_CUENTAS) {
					vectorCuentas[CuentaCorriente.getNumSiguiente()-1]=pedirCuenta();
					
				}else
					System.out.println("No hay espacio para más cuentas Corrientes");
				break;
			
			case 2: //INGRESAR
				if (CuentaCorriente.getNumSiguiente()>1) {
					numCuentaCorriente=buscarCuenta(vectorCuentas);
					do {
						System.out.println("Dinero a Ingresar: ");
						cantidad=teclado.nextDouble();
					}while (cantidad<0);
					vectorCuentas[numCuentaCorriente-1].ingresaEfectivo(cantidad);
				}else
					System.out.println("No hay cuentas creadas");
				break;
			case 3: //RETIRAR
				if (vectorCuentas[0]!=null) {
					numCuentaCorriente=buscarCuenta(vectorCuentas);
					do {
						System.out.println("Dinero a Retirar: ");
						cantidad=teclado.nextDouble();
					}while (cantidad<0);
					if (!vectorCuentas[numCuentaCorriente-1].retiraEfectivo(cantidad))
						System.out.println("No hay suficiente dinero en cuenta");
				}else
					System.out.println("No hay cuentas corrientes");
				break;
			case 4: //VISUALIZAR CUENTA
				if (CuentaCorriente.getNumSiguiente()>1) {
					numCuentaCorriente=buscarCuenta(vectorCuentas);
					System.out.println(numCuentaCorriente);
					System.out.println(vectorCuentas[numCuentaCorriente-1].visualiza());
				}else
					System.out.println("No hay cuentas corrientes");
				break;
			case 5: //VISUALIZAR CUENTAS
				if (CuentaCorriente.getNumSiguiente()>1) {
					for(int i=0;i<CuentaCorriente.getNumSiguiente()-1;i++)
						System.out.println(vectorCuentas[i].visualiza());
				}else
					System.out.println("No hay cuentas corrientes");
				break;
			}	
		}while (opcion!=0);
		System.out.println("FIN");
		teclado.close();
		
	}
	
	public static CuentaCorriente pedirCuenta() {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String cliente;
		CuentaCorriente cuenta;
		
		System.out.println("Dame el Titular: ");
		cliente=teclado.nextLine();
		cuenta=new CuentaCorriente(0,cliente);
		
		return cuenta;
		
	}
	
	public static int menu() {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\n1. Crear nueva Cuenta"
							  +"\n2. Ingresar en Cuenta"
							  +"\n3. Retirar de Cuenta"
							  +"\n4. Visualizar Cuenta"
							  +"\n5. Visualizar Cuentas"
							 +"\n0. Salir");
			opcion=teclado.nextInt();		
		}while (opcion<0 || opcion>5);
		return opcion;
		
	}
	public static Integer buscarCuenta(CuentaCorriente[] vectorCuentas) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		Integer numCuenta;
		do {
			System.out.println("Nº de cuenta?: ");
			numCuenta=teclado.nextInt();
		}while (numCuenta<1||numCuenta>CuentaCorriente.getNumSiguiente()-1);
		
		return numCuenta;
	}

}
