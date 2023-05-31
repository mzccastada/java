package exercise;

public class Producto {
	
	private String nombre;
	private int precio;
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "[" + this.getNombre() + ": " + this.getPrecio() + "]";
	}
}