package banco;

public class CuentaCorriente extends CuentaBancaria {

     CuentaCorriente(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(double importe) throws SaldoInsuficienteException{
        this.movimientos.add(new Movimiento(-importe));
	}

	@Override
	public void extraer(double importe, String concepto) throws SaldoInsuficienteException {
        this.movimientos.add(new Movimiento(-importe, concepto));
	}
	
	

}
