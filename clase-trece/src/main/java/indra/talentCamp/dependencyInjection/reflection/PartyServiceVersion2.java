package indra.talentCamp.dependencyInjection.reflection;

public class PartyServiceVersion2 {
	static private String repositoryClass = null;
	private Repository repository;
	
	public PartyServiceVersion2() {
		if(repositoryClass == null) {
			throw new Error("Te faltó configurar la clase PartyServiceVersion2");
		}
		
		try {
			Class<? extends Repository> clase = (Class<? extends Repository>) Class.forName(repositoryClass);
			this.repository = clase.getConstructor().newInstance();
		} catch (Exception e) {
			throw new Error("No se encuentra la clase" + this.repositoryClass);
		}
	}
	
	public static void registerRepositoryClass(String repositoryClass) {
		PartyServiceVersion2.repositoryClass = repositoryClass;
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Pero luego de divertirnos hay que guardar todo en el repo");
		this.repository.save();
	}
}