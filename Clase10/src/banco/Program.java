package banco;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
//		List<String> nombres = Arrays.asList("Juan", "Pedro", "Ramiro");
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Ramiro");
		nombres.add("Maryny");
		
		// Hacemos que la lista no sea modificable
		nombres = Collections.unmodifiableList(nombres);
//		nombres.add("Pepe");	//Esto dará excepcion porque hemos definido la lista como unmodifiable
		
		
	}
}