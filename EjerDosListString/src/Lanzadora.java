import java.util.*;
import utilidades.Leer;

public class Lanzadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMERO_MAXIMO = 15;
		int cantNum = (int) (Math.random() * NUMERO_MAXIMO + 1);
		
		String[] vString = { "este","este","bajo" };
							  // 0   //1    //2       

		ArrayList<String> objArrayList = new ArrayList<String>();
		LinkedList<String> objLinkedList= new LinkedList<String>();
		

	
		String p,cadena = "";
		Leer.mostrarEnPantalla("Se van a generar " + cantNum + " datos.\r\n" + "Insertando:");
		if (cantNum>vString.length)
			Leer.mostrarEnPantalla("Solo se van a generar "+vString.length+" palabras");
		
		
		for(int i=0; i<vString.length && i<cantNum; i++) {
			p = vString[(int)(Math.random()*vString.length)];
			cadena=cadena+p+" * ";
			
			if (!objArrayList.add(p))  {
				i--;
			}else {
				objLinkedList.add(p);
			}
			
			if (i == cantNum-1 || i==vString.length-1) {
				System.out.print(cadena.substring(0, cadena.length() - 3));
			}
		}

		System.out.println("\n\nValores de objHashSet:");
		mostrarSet(objArrayList);
		
		System.out.println("\n\nValores de objLinkedHashSet:");
		mostrarSet2(objLinkedList);
		
		
		System.out.println("\n\nValores de objHashSet:" + objArrayList);
		System.out.println("\nValores de objLinkedHashSet:" + objLinkedList);
		

	}
	public static void mostrarSet(ArrayList<String> objArrayList) {
		for (String i : objArrayList) {
			System.out.print(i + " ");
		}
	}
	public static void mostrarSet2(LinkedList<String> objLinkedList) {
		for (String i : objLinkedList) {
			System.out.print(i + " ");
		}

}
}
