package banco;

import java.util.*;

public abstract class CuentaBancaria {
	
	private static int ULTIMO_NUMERO = 1;
	
	private int numeroCuenta; //Voy a hacer cosas con esto....
	
	protected List<Movimiento> movimientos = new ArrayList<Movimiento>();  //Conviene usar un arrayList
	private Cliente propietario;
	
	//Si no pongo nada es private, pero un private especial que se llama package-private
    CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
		this.numeroCuenta = CuentaBancaria.ULTIMO_NUMERO;
		CuentaBancaria.ULTIMO_NUMERO++;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
        return movimientos.stream().mapToDouble(movimiento->movimiento.getImporte()).sum();
	}
	
	public List<Movimiento> getMovimientos() {
		return Collections.unmodifiableList(movimientos);
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public void depositar(double importe) {
        movimientos.add(new Movimiento(importe));
	}
	
	public void depositar(double importe, String concepto) {
	    movimientos.add(new Movimiento(importe, concepto));
	}
	
	
	public abstract void extraer(double importe) throws SaldoInsuficienteException;
	
	public abstract void extraer(double importe, String concepto) throws SaldoInsuficienteException;
}
