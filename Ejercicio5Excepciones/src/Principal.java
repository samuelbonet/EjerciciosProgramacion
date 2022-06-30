package Dni;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String elDni;
		
		int dato;
		do{
		 dato=Menu();
		if(dato==1)
		{
			
			try {
			
				System.out.println("Porfavor dame tu dni");
				elDni=sc.nextLine();
				Dni d= new Dni(elDni);
				System.out.println(d);
			}catch ( NumberFormatException  e) {
				
				System.out.println("error");
			}catch ( dniExcepcion  e) {
				
				System.out.println("error");
			}
		}
		}while(dato!=0);
		
		sc.close();
				
	}
	public static int Menu() {
		Scanner sc= new Scanner(System.in);
		int opcion;
		
		do {
		System.out.println("1-pedir DNI\n0-salir");	
		opcion=sc.nextInt();
		}while(opcion!=1 && opcion!=0);
		return opcion;
	}


}
