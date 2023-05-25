package indra.talentCamp.layers.persistence.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import indra.talentCamp.layers.persistence.*;
import indra.talentCamp.layers.models.*;

class JediMockRepositoryTests {

	@Test
	void shouldThrowsAnExceptionIfNotFound() {
		JediMockRepository repo = new JediMockRepository();
		assertThrows(NotFoundException.class, () -> repo.findById(28));
	}

	@Test
	void shouldSaveAndThenFind() throws NotFoundException {
		JediMockRepository repo = new JediMockRepository();
		Jedi yoda = new Jedi("Yoda", 100000, Color.GREEN);		
		repo.save(yoda);
		
		Jedi yodaRenacido = repo.findById(1);
		assertEquals(yoda.getNombre(), yodaRenacido.getNombre());
	}
}