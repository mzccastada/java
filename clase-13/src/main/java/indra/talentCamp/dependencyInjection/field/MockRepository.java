package indra.talentCamp.dependencyInjection.field;

import indra.talentCamp.dependencyInjection.field.Repository;

public class MockRepository implements Repository {
	
	public void save() {
		System.out.println("MockRepository: Soy un entorno controlado para probar");		
	}
}
