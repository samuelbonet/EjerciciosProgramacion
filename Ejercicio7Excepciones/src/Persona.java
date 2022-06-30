

public class Persona {
	
	private int edad;
	private String nombre;
	
	
	public Persona(String nombre,int edad) throws EdadInvalidaExcepcion {
		if(!esCorrecto(edad)) {
			throw new EdadInvalidaExcepcion();
		}
		this.edad=edad;
		this.nombre=nombre;
		
		
	}	
	public boolean esCorrecto(int edad) {
		boolean	correcto=false;
		
		if (edad<0)
		{
			correcto=false;
		}else correcto = true;
		return correcto;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws EdadInvalidaExcepcion {
		if(!esCorrecto(edad))
			throw new EdadInvalidaExcepcion();
		this.edad=edad;
	}
	
	
	@Override
	public  String toString() {
		String cadena="El Señor/a con nombre "+nombre+" tiene una edad de "+edad;
		return cadena;
	}

}
