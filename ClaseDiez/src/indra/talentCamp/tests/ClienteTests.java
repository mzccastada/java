package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import banco.Cliente;

public class ClienteTests {

	@Test
	public void shouldValidateClienteCreation() {
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setApellido("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setIdentificador(1).build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").setApellido("mal").build());
	}
}