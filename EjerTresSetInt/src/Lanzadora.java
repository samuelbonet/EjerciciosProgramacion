import java.util.*;
import utilidades.Leer;

public class Lanzadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMERO_MAXIMO=15;
		int cantNum=(int) (Math.random()*NUMERO_MAXIMO+1);
		
		HashSet <Integer> objHashSet = new HashSet <Integer>();
		LinkedHashSet <Integer> objLinkedHashSet = new LinkedHashSet <Integer>();
		TreeSet <Integer> objTreeSet = new TreeSet <Integer>();
		int num;
		String cadena="";
		
		Leer.mostrarEnPantalla("Se van a generar "+cantNum+" datos.\r\n"
				+ "Insertando:");
		
		for(int i=1; i<=cantNum; i++) {
			num=(int)(Math.random()*5);
			cadena=cadena+num+" * ";
			
			if(!objHashSet.add(num) || !objLinkedHashSet.add(num) || !objTreeSet.add(num)) {
				i--;
			}
			if(i==cantNum) {
				System.out.print(cadena.substring(0,cadena.length()-3));
			}
		}
		
		System.out.println("\n\nValores de objHashSet:");
		mostrarSet(objHashSet);
		
		System.out.println("\n\nValores de objLinkedHashSet:");
		mostrarSet(objLinkedHashSet);
		
		System.out.println("\n\nValores de objTreeSet:");
		mostrarSet(objTreeSet);
					
		System.out.println("\n\nValores de objHashSet:"+objHashSet);
		System.out.println("\nValores de objLinkedHashSet:"+objLinkedHashSet);
		System.out.println("\nValores de objTreeSet:"+objTreeSet);
		
	}
	
	public static void mostrarSet(Set<Integer> conjunto) {
		for (Integer i: conjunto) {
			System.out.print(i+" ");
		}
	}

}