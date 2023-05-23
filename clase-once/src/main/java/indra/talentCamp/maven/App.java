package indra.talentCamp.maven;

import java.util.Properties;
import com.google.gson.Gson;
import indra.talentCamp.maven.models.Persona;

public class App {

	public static void main(String[] args) {
		System.out.println("Hola Mundo Maven");
		
		String json = "{\"nombre\":\"Jane\",\"edad\":23}";		
		Gson gson = new Gson();
		Properties p = gson.fromJson(json, Properties.class);
		
		System.out.println("El nombre es: " + p.getProperty("nombre"));
		System.out.println("La edad es: " + p.getProperty("edad"));
		
		System.out.println("------------------------------------------");
		Persona persona = gson.fromJson(json, Persona.class);
		System.out.println("El nombre es: " + persona.getNombre());
		System.out.println("La edad es: " + persona.getEdad());
	}
}