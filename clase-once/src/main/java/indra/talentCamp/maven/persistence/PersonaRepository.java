package indra.talentCamp.maven.persistence;

import java.util.*;
import indra.talentCamp.maven.models.*;

public class PersonaRepository {
	
	
	public List<Persona> finadAll() {
		//Recupera todas las personas de la base de datos
		//return new ArrayList<>();	//Da error por la version de Java
		return new ArrayList<Persona>();
	}
	
	public void save(Persona p) {
		//Graba la persona en la persistencia, la base de datos, un archivo, lo que sea
		//INSERT INTO
	}
	
	public void update(Persona p) {
		//Actualizao la persona que ya existe
		//UPDATE
	}
	
	public void delete(Persona p) {
		//Elimino la persona de la base de datos
		
	}
}
