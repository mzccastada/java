package banco;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(double importe) {
		this.movimientos.add(new Movimiento(-importe));
	}

	@Override
	public void extraer(double importe, String concepto) {
		this.movimientos.add(new Movimiento(-importe, concepto));		
	}
}