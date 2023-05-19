package banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int identificador;
	
	public Cliente(String nombre, String apellido, int identificador) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificador = identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getIdentificador() {
		return identificador;
	}
}