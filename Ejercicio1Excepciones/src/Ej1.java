import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		final int NUM_ENTEROS = 5;
		int vEnteros[] = new int[NUM_ENTEROS];
		int i = 0;
		int datosIncorrect = 0;

		do {
			try {
				System.out.println("Dame un entero:");
				vEnteros[i] = sc.nextInt();
				i++;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("No has puesto un entero");
				datosIncorrect++;
			}
		} while (i < 5);
		sc.close();
		System.out.println("El nº de datos incorrectos es " + datosIncorrect);
		for (i = 0; i < vEnteros.length; i++) {
			System.out.print("->" + vEnteros[i]);
		}

	}

}
