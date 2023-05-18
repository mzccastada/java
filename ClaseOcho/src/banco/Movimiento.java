package banco;

import java.time.LocalDate;

public class Movimiento {
	
	private LocalDate fecha;
	private double cantidad;
	
	public Movimiento(double saldo) {
		super();
		this.cantidad = saldo;
		this.fecha = LocalDate.now();
		
	}
	
	public double getCantidad() {
		return this.cantidad;
	}
	
	@Override
	public String toString() {
		return "";
	}
}