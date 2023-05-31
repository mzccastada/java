package exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dada una lista de objetos Estudiante con propiedades de nombre y calificación, 
		 * utiliza una expresión lambda para obtener todos los estudiantes que tienen una 
		 * calificación superior a 90.
		 * 
		 * */
		List<Estudiante> estudiantes = Arrays.asList(
				new Estudiante("Anakin", 97.5),
				new Estudiante("Yoda", 53.20),
				new Estudiante("Asoka", 88.20),
				new Estudiante("Luke", 95.04),
				new Estudiante("Leia", 93),
				new Estudiante("Chewbaca", 10.04),
				new Estudiante("Darth Vader", 94.03));
		
		System.out.println("Estudiantes con calificaciones superior a 90:");
//		List<Estudiante> calificacionesMayoresA100 = estudiantes.stream().filter(e -> e.getCalificacion() > 90.0).collect(Collectors.toList());
//		calificacionesMayoresA100.forEach(System.out::println);
		
		//Otra forma
		estudiantes.stream().filter(e -> e.getCalificacion() > 90).forEach(System.out::println);
		
		System.out.println();
		
		
		/*Dado un arreglo de enteros, utiliza una expresión lambda para encontrar el número más grande */			
		List<Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);
		int max = numeros.stream().max((a,b) -> (a-b)).orElse(0);
		
		//Otra forma usando reduce
//		int max = numeros.stream().reduce(0, (a,b) -> Math.max(a, b));
		
		System.out.println("Máximo: " + max);
		
		/* Dada una lista de números enteros, utiliza una expresión lambda para obtener la suma de todos los números pares. */
		System.out.println("Sumatorio: " + numeros.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum());
		
		//Usando reduce
//		System.out.println("Sumatorio: " + numeros.stream().filter(n -> n % 2 == 0).reduce(0, (a,b) -> a + b));
		
		//Otra forma con reduce
//		System.out.println("Sumatorio: " + numeros.stream().reduce(0, (a,b) -> (b % 2 == 0)? a + b : a));

		
		/* Dada una lista de objetos Producto con propiedades de nombre y precio, 
		 * utiliza una expresión lambda para obtener el producto más caro.
		 */
		List<Producto> productos = Arrays.asList(
				new Producto("Anakin", 9),
				new Producto("Yoda", 4),
				new Producto("Asoka", 8),
				new Producto("Luke", 3),
				new Producto("Leia", 2));
				
		System.out.println("Producto más caro: " + productos.stream().max( (a,b) -> a.getPrecio() - b.getPrecio() ).orElse(null));
	}
}