
import static org.junit.Assert.assertEquals;
import java.util.Properties;
import org.junit.*;
import com.google.gson.Gson;
import indra.talentCamp.maven.models.Persona;

public class GsonTests {
	
	private String json = "{\"nombre\":\"Jane\",\"edad\":23}";
	private Gson gson = new Gson();
	
	@Test
	public void shouldReadPropertiesFromJson() {
		Properties p = gson.fromJson(json, Properties.class);
		assertEquals("Jane", p.getProperty("nombre"));
		assertEquals("23", p.getProperty("edad"));
		
		System.out.println("El nombre es: " + p.getProperty("nombre"));
		System.out.println("La edad es: " + p.getProperty("edad"));
	}
	
	@Test
	public void shouldReadCustomObjectFromJson() {
		Persona persona = gson.fromJson(json, Persona.class); 
		assertEquals("Jane", persona.getNombre());
        assertEquals(23, persona.getEdad());
	}
}