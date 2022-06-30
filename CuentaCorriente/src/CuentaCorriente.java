
public class CuentaCorriente {
	//ATRIBUTOS
	private Integer numCuenta;
	private double saldo;
	private String cliente;
	private static Integer numSiguiente=1;
	//CONSTRUCTOR
	public CuentaCorriente(double cantidad,String cliente) {
		this.saldo=cantidad;
		this.cliente=cliente;
		this.numCuenta=CuentaCorriente.numSiguiente;
		CuentaCorriente.numSiguiente++;
	}
	
	public static Integer getNumSiguiente() {
		return numSiguiente;
	}

	

	public Integer getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCliente() {
		return cliente;
	}

	//METODOS
	public void ingresaEfectivo(double cantidad) {
		if (cantidad>0) this.saldo+=cantidad;
	}
	public boolean retiraEfectivo(double cantidad) {
		boolean esPosible=true;
		if (cantidad<=this.saldo) {
			this.saldo-=cantidad;
		}else esPosible=false;
		return esPosible;
	}
	
	public String visualiza() {
		return "Titular: "+this.cliente+" Nº Cuenta: "+this.numCuenta+"\nsaldo= "+this.saldo;
	}

}
