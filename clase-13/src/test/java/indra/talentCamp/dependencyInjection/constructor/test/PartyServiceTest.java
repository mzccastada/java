package indra.talentCamp.dependencyInjection.constructor.test;

import static org.junit.Assert.*;
import org.junit.Test;
import indra.talentCamp.dependencyInjection.constructor.PartyService;
import indra.talentCamp.dependencyInjection.constructor.MockRepository;

public class PartyServiceTest {

	@Test
	public void test() {
		//Tiempo de configuracion
		PartyService service = new PartyService(new MockRepository());
		
		//Tiempo de ejecucion
		service.haveFun();
		
		
		assertEquals(true, true);
		
	}

}
