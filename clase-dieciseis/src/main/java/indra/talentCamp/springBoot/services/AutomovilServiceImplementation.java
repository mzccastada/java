package indra.talentCamp.springBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import indra.talentCamp.springBoot.models.Automovil;
import indra.talentCamp.springBoot.repositories.AutomovilRepository;

@Service
public class AutomovilServiceImplementation implements AutomovilService {
	
	@Autowired
	private AutomovilRepository repository;
	
	@Override
	public Automovil autoDeElonMusk() {
		/*return new Automovil() {{	//constructor initializer
			setId(1);
			setMarca("Tesla");
			setMatricula("43674MD");
			setElectrico(true);
		}};	*/
		return this.repository.findById(55);
	}	
}