package indra.talentCamp.maven.services;

import java.util.*;
import indra.talentCamp.maven.models.*;
import indra.talentCamp.maven.persistence.*;

public class PersonaService {
	
	private PersonaRepository repository;
	
	public PersonaService() {
		this.repository = new PersonaRepository();			
	}
	
	public List<Persona> recuperarPersonas() {
		List<Persona> personas = this.repository.finadAll();
		
		//Eliminar las personas que el usuario actual
		//no tiene permiso de ver
		
		//Sacar las personas que no estan activas
				
		//Hacer validaciones si tengo permisos para 
		//recuperar las personas
				
		//Guardar un mensaje de log de que es lo que esta pasando
		
		return personas; 
	}
	
	public void registrarPersonaNueva(Persona p) {
		//Valido que la persona cunpla las reglas de negocio
    	//Delego la validacion al modelo o en ultima instancia valido aqui
    	//Ejemplo
    	if (p.getNombre()==null) {
    		//throw new ValidationException("Falta el nombre");
    	}
    	
    	this.repository.save(p);		
	}
}