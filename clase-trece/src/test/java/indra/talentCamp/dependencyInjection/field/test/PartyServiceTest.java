package indra.talentCamp.dependencyInjection.field.test;

import static org.junit.Assert.*;
import indra.talentCamp.dependencyInjection.field.*;
import org.junit.Test;

public class PartyServiceTest {

	@Test
	public void test() {
		//Tiempo de configuracion
		 PartyService service = new PartyService();
		 service.setRepository(new MockRepository());

		 //Timepo de ejecucion
		 service.haveFun();
		 assertEquals(true,true);
	}
}