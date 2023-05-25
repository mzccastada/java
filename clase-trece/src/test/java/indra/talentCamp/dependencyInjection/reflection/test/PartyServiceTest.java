package indra.talentCamp.dependencyInjection.reflection.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import indra.talentCamp.dependencyInjection.reflection.MockRepository;
import indra.talentCamp.dependencyInjection.reflection.PartyService;
import indra.talentCamp.dependencyInjection.reflection.PartyServiceVersion2;

public class PartyServiceTest {
	
	@Before
	public void configure() {
		//Tiempo de configuracion (usar Mock, no estamos en produccion al hacer tests)
		PartyService.registerRepositoryClass(MockRepository.class);
		PartyServiceVersion2.registerRepositoryClass("indra.talentCamp.dependencyInjection.reflection.MockRepository");
	}
	
	@Test
	public void test() {
		//Tiempo de ejecución
		PartyService service = new PartyService();
		service.haveFun();
		
		assertEquals(true, true);
	}
	
	@Test
	public void test2() {
		//Tiempo de ejecución
		PartyServiceVersion2 service = new PartyServiceVersion2();
		service.haveFun();		
	}
}