package indra.talentCamp.maven.controllers;

import java.util.*;
import indra.talentCamp.maven.models.*;
import indra.talentCamp.maven.services.*;

public class PersonaController {
	private PersonaService service;
	
	public PersonaController() {
		this.service = new PersonaService();		
	}
	
	public String mostrarTodas() {
		List<Persona> personas = this.service.recuperarPersonas();
		
		//Arma una tabla html con la lista de personas
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
//		personas.forEach(()-> (/*...*/));
		builder.append("</table>");
		
		return builder.toString();
	}
}