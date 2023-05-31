package banco;

public class CajaAhorro extends CuentaBancaria {

	public CajaAhorro(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(double importe) throws SaldoInsuficienteException {
		if(this.getSaldo() < importe) {
			throw new SaldoInsuficienteException();
		}
		
		this.movimientos.add(new Movimiento(-importe));		
	}

	@Override
	public void extraer(double importe, String concepto) throws SaldoInsuficienteException {
		if(this.getSaldo() < importe) {
			throw new SaldoInsuficienteException();
		}
		
		this.movimientos.add(new Movimiento(-importe, concepto));		
	}
}