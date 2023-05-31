package indra.talentCamp.database.services;

import java.util.List;

import indra.talentCamp.database.models.Persona;
import indra.talentCamp.database.persistence.PersonaRepository;
import lombok.Getter;
import lombok.Setter;

public class PersonaService {
	
	@Getter @Setter
	private PersonaRepository repository;
	
	public List<Persona> cracksDeJava() {
		return this.repository.findAll();
	}
}