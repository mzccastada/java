package indra.talentCamp.dependencyInjection.ioc;

public class IoCInjectionDemo {
	public static void aTodoGas() {
		//Tiempo de configuracion
		BeanFactoryV1 factory = new BeanFactoryV1();
		factory.registerRepository(new DatabaseRepository());
		
		BeanFactoryV2 factoryV2 = new BeanFactoryV2();
		factoryV2.registerDependency(PartyService.class, "repository", DatabaseRepository.class);
		
		//Tiempo de ejecucion
		PartyService service = factory.createPartyService();
		service.haveFun();
		
		PartyService serviceV2 = (PartyService)factoryV2.createBean(PartyService.class);
		serviceV2.haveFun();			
	}	
}