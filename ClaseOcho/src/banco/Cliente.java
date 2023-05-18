package banco;

public class Cliente {
	
	private String nombre;
	private int numDocumento;
	
	public Cliente(String nombre, int num_documento) {
		super();
		this.nombre = nombre;
		this.numDocumento = num_documento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumDocumento() {
		return numDocumento;
	}
	
	

}
