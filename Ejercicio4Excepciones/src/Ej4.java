import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUM_DIVISIONES=5;
		int numerador,denominador,numDivisiones=0,
				datosIncorrectos=0,divCero=0;
		
		do {
			try {
				System.out.println("Dame un numerador ");
				numerador=pedirNumero();
				System.out.println("Dame un divisor");
				denominador=pedirNumero();
				
				System.out.println("Resultado: "+numerador/denominador);
				numDivisiones++;
				
			}catch(ArithmeticException e) {
				System.err.println("Has dividido por 0");
				divCero++;
			}catch(InputMismatchException e){
				System.err.println("Has metido un dato incorrecto");
				datosIncorrectos++;
				
			}
			
		}while(numDivisiones<NUM_DIVISIONES);
		
		System.out.println("Tus datos Erroneos son " +datosIncorrectos+"\nHas dividido por 0 "+divCero+" Estas veces");
		
	}
	
	public static int pedirNumero() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int num;
		num=sc.nextInt();
		return num;
		
	}

}
