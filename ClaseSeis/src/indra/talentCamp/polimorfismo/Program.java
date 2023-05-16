package indra.talentCamp.polimorfismo;

import indra.talentCamp.polimorfismo.models.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player excalibur = new Warrior("Excalibur");
		Warrior batman = new Warrior("Batman");
		Player thanos = new Wizard("Thanos");
		
		List<Player> players = new ArrayList<Player>();
		players.add(excalibur);
		players.add(batman);
		players.add(thanos);
		
		
		//Comienzo del turno
		System.out.println("Comienzo del turno");
		players.forEach(System.out::println);
		System.out.println("------------------");
		
		batman.action(excalibur);
		thanos.action(excalibur);	
		
		players.forEach(p -> p.endTurn());
		
		//Fin del turno
		System.out.println("------------------");
		System.out.println("Fin del turno. Los que quedaron vivos son:");
		players.stream().filter(n -> n.isAlive()).forEach(System.out::println);
	}
}