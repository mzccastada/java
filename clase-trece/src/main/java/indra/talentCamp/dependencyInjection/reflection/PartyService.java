package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {
	
	static private Class<? extends Repository> repositoryClass = null;
	private Repository repository;
	
	public PartyService() {
		if(PartyService.repositoryClass == null) {
			throw new Error("Te olvidaste de configurar el PartyService");
		}
		
		try {
			//Esta forma sirve solamente para las clases que tienen constructores
			//sin parametros 
			//Parameterless constructor
			this.repository = PartyService.repositoryClass.getConstructor().newInstance();
		} catch(Exception e) {
			throw new Error("El constructor es privado");
		}
	}
	
	public static void registerRepositoryClass(Class<? extends Repository> repositoryClass) {
		PartyService.repositoryClass = repositoryClass;
	}		
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Pero luego de divertirnos hay que guardar todo en el repo");
		this.repository.save();
	}
}