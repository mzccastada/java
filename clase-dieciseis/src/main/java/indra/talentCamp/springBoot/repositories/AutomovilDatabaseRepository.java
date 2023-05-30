package indra.talentCamp.springBoot.repositories;

import org.springframework.stereotype.Repository;
import indra.talentCamp.springBoot.models.Automovil;

@Repository
public class AutomovilDatabaseRepository implements AutomovilRepository {

	@Override
	public Automovil findById(int id) {
		return new Automovil() {{
			setId(id);
			setMarca("Tesla");
			setMatricula("43674MD");
			setElectrico(true);
		}};
	}
}