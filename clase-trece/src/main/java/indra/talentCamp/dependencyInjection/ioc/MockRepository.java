package indra.talentCamp.dependencyInjection.ioc;

public class MockRepository implements Repository {
	
	public void save() {
		System.out.println("MockRepository: Soy un entorno controlado para probar");
		
	}
}
