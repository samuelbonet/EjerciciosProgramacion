import java.util.*;
import utilidades.Leer;

public class Lanzadora {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMERO_MAXIMO = 15;
		int cantNum = (int) (Math.random() * NUMERO_MAXIMO + 1);

		ArrayList<Integer> objArrayList = new ArrayList<Integer>();
		LinkedList<Integer> objLinkedList = new LinkedList<Integer>();

		int num;
		String cadena = "";

		Leer.mostrarEnPantalla("Se van a generar " + cantNum + " datos.\r\n" + "Insertando:");

		for (int i = 1; i <= cantNum; i++) {
			num = (int) (Math.random() * 5);
			cadena = cadena + num + " * ";

			if (!objArrayList.add(num)) {
				i--;
			} else {
				objLinkedList.add(num);

			}

			if (i == cantNum) {
				System.out.print(cadena.substring(0, cadena.length() - 3));
			}
		}

		System.out.println("\n\nValores de objArrayList:");
		for (Integer i : objArrayList) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nValores de objLinkedList:");
		for (Integer i : objLinkedList) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nValores de objArrayList:" + objArrayList);
		System.out.println("\nValores de objLinkedList:" + objLinkedList);

	}
}
