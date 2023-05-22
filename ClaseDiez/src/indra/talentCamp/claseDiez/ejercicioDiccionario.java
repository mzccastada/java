package indra.talentCamp.claseDiez;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicioDiccionario {
	/*
	 * Utilizar un diccionario y el metodo Split de java para dado un 
	 * string contar la ocurrencia de cada palabra. Luego iterar el 
	 * diccionario y mostrar la ocurrencia de cada palabra
	 * 
	 */
	public static void main(String[] args) {
		String texto = "Hola que tal, como están todos hola hola";
		List<String> palabras = Arrays.asList(texto.toLowerCase().split(" "));
		Map<String, Integer> diccionario = new HashMap<>();
		
		for(String p : palabras) {			
			if(diccionario.containsKey(p)) {
				diccionario.replace(p, diccionario.get(p) + 1);
			}
			else {
				diccionario.put(p, 1);
			}
		}
		
		for(var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + " : " + entrada.getValue());
		}		
	}
}