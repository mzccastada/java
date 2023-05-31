package banco;

public class CajaDeAhorro extends CuentaBancaria{

     CajaDeAhorro(Cliente propietario) {
		super(propietario);
	}

	@Override
	public void extraer(double importe) throws SaldoInsuficienteException{
        if (this.getSaldo() < importe) {
        	   throw new SaldoInsuficienteException();
        }
        
        this.movimientos.add(new Movimiento(-importe));
	}

	@Override
	public void extraer(double importe, String concepto) throws SaldoInsuficienteException {
        if (this.getSaldo() < importe) {
     	   throw new SaldoInsuficienteException();
        }
     
        this.movimientos.add(new Movimiento(-importe, concepto));
	}

}
