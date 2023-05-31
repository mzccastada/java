package exercise;

public class Estudiante {
	private String nombre;
	private double calificacion;
	
	public Estudiante(String nombre, double calificacion) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
	@Override
	public String toString() {
		return this.getNombre() + ": " + this.getCalificacion();
	}
}