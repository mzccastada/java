package banco;

import java.time.LocalDate;

public class Movimiento {

	private LocalDate fecha;
	private double importe; //Positivo, deposito, Negativo, extraccion;
	private String concepto;
    
    public Movimiento(double importe) {
		super();
		this.importe = importe;
		this.fecha = LocalDate.now();
		this.concepto = (importe > 0)? "Deposito" : "Extracción";
	}
    
    public Movimiento(double importe, String concepto) {
    	super();
		this.importe = importe;
		this.fecha = LocalDate.now();
		this.concepto = concepto;
    }

	public double getImporte() {
		return importe;
	}

	public String getConcepto() {
		return concepto;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public TipoDeMovimiento getTipo() {
		if (this.importe > 0) {
			return TipoDeMovimiento.Deposito;
		}
		
		return TipoDeMovimiento.Extraccion;
	}	
}