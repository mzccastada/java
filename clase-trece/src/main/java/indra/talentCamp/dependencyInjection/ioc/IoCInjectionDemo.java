package indra.talentCamp.dependencyInjection.ioc;

public class IoCInjectionDemo {
	public static void aTodoGas() {
		//Tiempo de configuracion
		BeanFactoryV1 factory = new BeanFactoryV1();
		factory.registerRepository(new DatabaseRepository());
		
		//Tiempo de ejecucion
		PartyService service = factory.createPartyService();
		service.haveFun();
	}	
}