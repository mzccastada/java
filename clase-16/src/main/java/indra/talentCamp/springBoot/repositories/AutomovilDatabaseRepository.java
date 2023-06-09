package indra.talentCamp.springBoot.repositories;

import org.springframework.stereotype.Repository;
import indra.talentCamp.springBoot.models.Automovil;
import java.util.*;

@Repository
public class AutomovilDatabaseRepository implements AutomovilRepository {
	private static List<Automovil> automoviles = new ArrayList<Automovil>();
	private static int ULTIMO_ID = 1;	

	
	@Override
	public Automovil findById(int id) {
		return new Automovil() {{
			setId(id);
			setMarca("Tesla");
			setMatricula("43674MD");
			setElectrico(true);
		}};
	}
		
	@Override
	public void save(Automovil autoNuevo) {
		//Lo guardo en la base de datos
		autoNuevo.setId(ULTIMO_ID);
		ULTIMO_ID++;
		this.automoviles.add(autoNuevo);		
	}
}