package banco;

import java.util.*;

public class Banco {
	
	private List<CuentaBancaria> cuentas = new ArrayList<>();

	public List<CuentaBancaria> getCuentas() {
		return Collections.unmodifiableList(cuentas);
	}
	
	public CuentaBancaria crearCajaAhorro(Cliente cliente) {
		CajaAhorro cuenta = new CajaAhorro(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria crearCuentaCorriente(Cliente cliente) {
		CuentaCorriente cuenta = new CuentaCorriente(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria buscarCuenta(int idCuenta) {
		return cuentas.stream().filter(c -> c.getIdCuenta() == idCuenta).findFirst().orElse(null);
	}
}