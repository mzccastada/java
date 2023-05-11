package exercise;

public class ProductoElectrónico {
	
	private String nombre;
	private double precio;
	private int cantidad_stock;
	private String marca;
	
	public ProductoElectrónico(String nombre, double precio, int cantidad_stock, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad_stock = cantidad_stock;
		this.marca = marca;
	}
		
	/* setters */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setCantidad_stock(int cantidad_stock) {
		this.cantidad_stock = cantidad_stock;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/* getters */
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad_stock() {
		return cantidad_stock;
	}

	public String getMarca() {
		return marca;
	}
	
	public void vender() {
		if(this.cantidad_stock == 0) {
			System.out.println("Ya no hay stock");
		}
		else {
			this.cantidad_stock--;
		}
	}
	
	@Override
	public String toString() {
		return "Producto: " + this.getNombre() + "\n" +
				"Precio: " + this.getPrecio() + "\n" +
				"Cantidad stock: " + this.getCantidad_stock() + "\n" +
				"Marca: " + this.getMarca() + "\n";
	}
}
