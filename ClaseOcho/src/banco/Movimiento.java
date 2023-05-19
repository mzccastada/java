package banco;

import java.time.LocalDate;

public class Movimiento {
	
	private LocalDate fecha;
	private double importe;
	private String concepto;
	
	public Movimiento(double importe) {
		super();
		this.importe = importe;
		this.fecha = LocalDate.now();
		this.concepto = (importe > 0) ? "Depósito" : "Extracción"; 
	}
	
	public Movimiento(double importe, String concepto) {
		super();
		this.importe = importe;
		this.fecha = LocalDate.now();
		this.concepto = (importe > 0) ? "Depósito" : "Extracción"; 
	}
	
	public double getImporte() {
		return this.importe;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public TipoDeMovimiento getTipo() {
		if(this.importe > 0) {
			return TipoDeMovimiento.Deposito;
		}
		
		return TipoDeMovimiento.Extraccion;
	}

	@Override
	public String toString() {
		return "";
	}
}