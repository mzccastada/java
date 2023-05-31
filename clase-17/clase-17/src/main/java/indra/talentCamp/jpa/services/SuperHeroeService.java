package indra.talentCamp.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import indra.talentCamp.jpa.models.*;
import indra.talentCamp.jpa.persistence.SuperHeroeRepository;

@Service
public class SuperHeroeService {
	
	@Autowired
	private SuperHeroeRepository repository;
	
	public void registrarAvenger(SuperHeroe heroe) throws BusinessException {
		heroe.evaluarFuerza();
		heroe.validate();	
		
		this.repository.save(heroe);
	}
}