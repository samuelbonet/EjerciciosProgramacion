import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ERRORES=5;
		int numero=0,contadorErrores=0;
		boolean correcto=false;
		do {
			try {
				numero=pedirNumero();
				correcto=true;
			}catch (InputMismatchException e) {
				contadorErrores++;
				System.err.println("Dato erroneo. Introduce un nº");
			}
		}while(!correcto && contadorErrores<MAX_ERRORES);
		if (contadorErrores==MAX_ERRORES)
			System.out.println("No se ha leido el nº por superar los "+MAX_ERRORES+" errores");
		else
			System.out.println("El nº es "+numero);
	}
	public static int pedirNumero() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Dame un número: ");
		num=sc.nextInt();
		return num;
	}
}
