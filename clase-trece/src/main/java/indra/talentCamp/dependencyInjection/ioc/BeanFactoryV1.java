package indra.talentCamp.dependencyInjection.ioc;

public class BeanFactoryV1 {
	
	Repository repository;
	
	void registerRepository(Repository repo) {
		this.repository = repo;
	}
	
	PartyService createPartyService() {
		return new PartyService(this.repository);
	}
}