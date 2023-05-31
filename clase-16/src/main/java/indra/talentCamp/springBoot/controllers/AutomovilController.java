package indra.talentCamp.springBoot.controllers;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import indra.talentCamp.springBoot.dto.*;
import indra.talentCamp.springBoot.models.Automovil;
import indra.talentCamp.springBoot.services.AutomovilService;

@RestController
public class AutomovilController {

	@Autowired
	private AutomovilService service;

	@RequestMapping(value = "api/automovil", method = RequestMethod.POST)
	public RegistrarAutomovilResult registrarAutomovil(@RequestBody RegistrarAutomovilParams params) {
		try {
			Logger logger = LogManager.getLogger(AutomovilController.class);
			logger.log(Level.INFO, "POST /api/automovil  -- Body " + params);

			assert params.getMarca() != null : "Debe Ingresar la marca del automovil";
			assert params.getMatricula() != null : "Debe ingresar la matricula del automovil";

			Automovil auto = new Automovil() {
				{ // constructor initializer
					setMarca(params.getMarca());
					setMatricula(params.getMatricula());
				}
			};

			this.service.registrarAutomovil(auto);

			return new RegistrarAutomovilResult(true, "Automovil Registrado Satisfactoriamente con ID " + auto.getId());
		} catch (Throwable ex) {
			return new RegistrarAutomovilResult(false, "Error Registrando Automovil" + ex.getMessage());
		}
	}
}