package indra.talentCamp.layers;

import java.awt.Color;
import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.*;

public class App {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a una nueva clase");
		
		JediFileRepository prueba = new JediFileRepository();
		
		/*try {
			prueba.save(new Jedi("Anakin", 1000, Color.red));
		} catch (SaveErrorException e) {
			e.printStackTrace();
		}*/
		
		/*Jedi jedi;
		
		try {
			jedi = prueba.findById(1);
			System.out.println(jedi);
		} catch (NotFoundException e){
			e.printStackTrace();
		}*/
		
		
	}
}