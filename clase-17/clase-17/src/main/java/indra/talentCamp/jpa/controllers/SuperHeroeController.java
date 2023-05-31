package indra.talentCamp.jpa.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import indra.talentCamp.jpa.dto.*;
import indra.talentCamp.jpa.models.BusinessException;
import indra.talentCamp.jpa.models.SuperHeroe;
import indra.talentCamp.jpa.services.SuperHeroeService;

@RestController
public class SuperHeroeController {

	@Autowired
	private SuperHeroeService service;

	// GET /api/hero --> Me lista todos

	// POST /api/hero --> Agregar uno nuevo
	@RequestMapping(value = "/api/hero", method = RequestMethod.POST)
	public ResponseEntity<?> nuevoHeroe(@RequestBody NuevoHeroeRequest request) {
		try {
			SuperHeroe avenger = new SuperHeroe();
			avenger.setNombreArtistico(request.getName());
			avenger.setSuperpoder(request.getPower());			
			
			this.service.registrarAvenger(avenger);
			
			return new ResponseEntity<>("Heroe Registrado en acuerdo de Socovia",
					HttpStatus.OK);
		} catch (BusinessException ex) {
			return new ResponseEntity<>(ex.getMessage(), 
					HttpStatus.BAD_REQUEST);
			//Sugerencia: En general error de validacion o negocio --> BadRequest
			//			  Error base de datos, memoria, etc --> 5xx
		} catch (Exception ex) {
			return new ResponseEntity<>(ex.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}