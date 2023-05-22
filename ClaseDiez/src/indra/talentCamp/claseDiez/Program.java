package indra.talentCamp.claseDiez;

import java.time.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		//Manejo de fechas
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha actual: " + fechaActual);
		
		LocalDateTime fechaYHoraActual = LocalDateTime.now();
		System.out.println("Fecha y hora actual: " + fechaYHoraActual);
		
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual: " + horaActual);				
		
		LocalDate cumple = LocalDate.of(2023,  Month.DECEMBER, 24);
		System.out.format("Feliz cumple el %d del mes %s", 
					cumple.getDayOfMonth(),
					cumple.getMonth());
		System.out.println();
		
		LocalDate navidad = cumple.plusDays(1);
		System.out.println("Feliz navidad");
		System.out.println();
		
		if(cumple.isBefore(navidad)) {
			System.out.println("El cumple es antes de Navidad");
		}
		
		Period periodo = Period.between(cumple, navidad);
		System.out.format("Hay %d años, %d meses, %d días entre el cumple y la navidad",
				periodo.getYears(), periodo.getMonths(), periodo.getDays());
		System.out.println();
		
		Duration duracion = Duration.between(LocalTime.now(), LocalTime.now().plusHours(1));
		System.out.println(duracion.getSeconds());
		System.out.println();
		
		//Manejo de Strings
		String texto = "Hola que tal, como están todos";
		List<String> palabras = Arrays.asList(texto.split(" "));
		palabras.forEach(System.out::println);
		System.out.println();
		
		String textoAMinuscula = texto.toLowerCase();
		
		
				
		//Diccionarios
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("casa", "Lugar donde vive la gente");
		
		if(!diccionario.containsKey("auto")) {
			diccionario.put("auto", "Vehiculo que te lleva de un lado a otro");
		}
		
		for(var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + " : " + entrada.getValue());
		}
		
		System.out.println();
		
		//Set 
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		
		System.out.println(conjunto.size());
		
		for(var e : conjunto) {
			System.out.println(e);
		}
		System.out.println();
		
		//Priority Queue
		Queue<Integer> prioridades = new PriorityQueue<>();
		prioridades.offer(9);
		prioridades.offer(19);
		prioridades.offer(49);
		prioridades.offer(2);
		prioridades.offer(4);
		
		System.out.println("Valor más prioritario: " + prioridades.poll());
		System.out.println("Valor más prioritario: " + prioridades.poll());
		prioridades.offer(1);
		System.out.println("Valor más prioritario: " + prioridades.poll());
	}
}