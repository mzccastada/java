package banco;

public class SaldoInsuficienteException extends Exception {
	
	private static final long serialVersionUID = 1L;	
	
	public SaldoInsuficienteException() {
		super("No posee saldo suficiente para realizar la operación");
	}
}
