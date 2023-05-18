package banco;

import java.util.*;

public abstract class CuentaBancaria {
	
	private int numCuenta;
	private List<Movimiento> movimientos = new ArrayList<>();
	private Cliente propietario;
	
	
	public CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
	}

	public double getSaldo() {
		throw new Error("Not implemented");
	}
	
	public abstract void depositar(double cantidad);
	public abstract void extraer(double cantidad);
}
