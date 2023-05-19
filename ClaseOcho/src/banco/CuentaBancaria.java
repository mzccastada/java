package banco;

import java.util.*;

public abstract class CuentaBancaria {
	
	private static int NUM_CUENTAS;
	private int idCuenta;
	protected List<Movimiento> movimientos = new ArrayList<>();
	private Cliente propietario;
	
	//Lo definimos como package-private (sin el public)
	CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
		this.NUM_CUENTAS = CuentaBancaria.NUM_CUENTAS;
		CuentaBancaria.NUM_CUENTAS++;
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public double getSaldo() {
		return movimientos.stream().mapToDouble(movimiento -> movimiento.getImporte()).sum();
	}
	
	public int getIdCuenta() {
		return idCuenta;
	}
	
	public List<Movimiento> getMovimientos() {
		return Collections.unmodifiableList(movimientos);
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