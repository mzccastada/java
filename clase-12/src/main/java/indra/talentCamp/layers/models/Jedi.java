package indra.talentCamp.layers.models;

import java.awt.Color;

public class Jedi extends BusinessObject {
	
	private String nombre;
	private int nivelDeFuerza;
	private Color colorLightSaber;
	
	public Jedi(String nombre, int nivelDeFuerza, Color colorLightSaber) {
		super();
		this.nombre = nombre;
		this.nivelDeFuerza = nivelDeFuerza;
		this.colorLightSaber = colorLightSaber;
	}
	
	public Jedi(String nombre, Color colorLightSaber) {
		super();
		this.nombre = nombre;
		this.nivelDeFuerza = 0;
		this.colorLightSaber = colorLightSaber;
	}
	
	public void setNivelDeFuerza(int nivelDeFuerza) {
		this.nivelDeFuerza = nivelDeFuerza;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getNivelDeFuerza() {
		return nivelDeFuerza;
	}

	public Color getColorLightSaber() {
		return colorLightSaber;
	}
	
	@Override
	public String toString() {
		return "Jedi " + getId() + 
				", nombre = " + nombre + 
				", nivelDeFuerza = " + nivelDeFuerza + 
				", colorLightSaber = " + colorLightSaber;
	}
}