package indra.talentCamp.dependencyInjection.ioc;

public class DatabaseRepository implements Repository {

	public void save() {
		System.out.println("DatabaseRepository: Hago un INSERT INTO y grabo en la base de datos");
	}

}