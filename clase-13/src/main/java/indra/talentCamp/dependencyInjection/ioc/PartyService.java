package indra.talentCamp.dependencyInjection.ioc;

public class PartyService {
	
	private Repository repository;
	
	public PartyService() {
		super();
	}
	
	//Package-protected: desde fuera de este paquete no se puede crear un PartyService
	PartyService(Repository repository) {
		this.repository = repository;
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Pero luego de divertirnos hay que guardar todo en el repo");
		this.repository.save();
	}
}