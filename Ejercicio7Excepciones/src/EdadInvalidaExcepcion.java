
public class EdadInvalidaExcepcion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public EdadInvalidaExcepcion() {
		super("No se puede tener una edad menor que 0");
	}


}
