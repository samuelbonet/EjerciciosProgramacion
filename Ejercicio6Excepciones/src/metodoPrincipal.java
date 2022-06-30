                    
import java.util.Scanner;
                 
public class metodoPrincipal {
                  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		System.out.println("***EDADES***");
		boolean edadCorrecta=false;
		int edad;
		do {
			try {
				edad = pedirEdad();
				edadCorrecta=true;
				System.out.println("Edad: "+edad+" años");
					                    
			} catch (EdadIncorrectaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("ERROR DATOS");
			}
		}while(!edadCorrecta);
	}
	
	public static int pedirEdad() throws EdadIncorrectaException  {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int edad;             
		System.out.print("Introduce tu edad: ");
		edad=sc.nextInt();
		              
		if (edad<18 || edad>65)
			throw new EdadIncorrectaException();
		return edad;
	}        
	
}
