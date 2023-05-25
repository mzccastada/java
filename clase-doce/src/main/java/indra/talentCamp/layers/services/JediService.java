package indra.talentCamp.layers.services;

import java.awt.Color;
import java.util.Random;
import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.SaveErrorException;
import indra.talentCamp.layers.persistence.interfaces.Repository;

public class JediService {
	
	private Repository<Jedi> repository;
	
	public JediService(Repository<Jedi> repo) {
		//Dependencia fija, establecida en el constructor		
		//this.repository = new JediMockRepository();
		//this.repository = new JediFileRepository();
		
		//Que solucion se les ocurre para que el Servicio pueda trabajar indistintamente con
		//cualquier tipo de repositorio y si se cambia el repositorio concreto no haya que
		//actualizar el codigo del servicio
		this.repository = repo;
	}
	
	private int calcularNivelFuerza(Jedi j) {
		return new Random().nextInt(1000, 100000);
	}
	
	private Color crearLightSaberNuevo() {
		return Color.GREEN;
	}
	
	public void alistarse(String nombre) {
		Jedi nuevo = new Jedi(nombre, this.crearLightSaberNuevo());
		nuevo.setNivelDeFuerza(this.calcularNivelFuerza(nuevo));
		 try {
				this.repository.save(nuevo);
			} catch (SaveErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}